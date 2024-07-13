/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Curso;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author a1feu
 */
public class CursoDAO {
    //Classe de Objeto de Acesso aos Dados
    // Classe que faz conexão com o a tabela cursos do BD
    
    private Conexao conexao;
    private Connection conn;
    
    public CursoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Curso curso){
        String sql = "INSERT INTO cursos(id, nomecurso, nivel, duracao) VALUES " // precisa ter o mesmo nome da tabela no BD
                + "(?,?,?,?)"; // o número de ? depende do numero de parametros no insert
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, curso.getId());
            stmt.setString(2, curso.getNomecurso());//No parametro 1 vao o nome do curso
            stmt.setString(3, curso.getNivel());
            stmt.setInt(4, curso.getDuracao());
            // Executar a query
            stmt.execute(); // Roda ese comando mo mysql
        } catch(Exception e){
            System.out.println("Erro ao inserir curso "+ e.getMessage());
        }
    }
    
    public void editar(Curso curso){
        String sql = "UPDATE cursos SET nomecurso=?, nivel=?, duracao=? WHERE id=?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, curso.getNomecurso());
            stmt.setString(2, curso.getNivel());
            stmt.setInt(3, curso.getDuracao());
            stmt.setInt(4, curso.getId());
            
            stmt.execute();
        } catch (Exception e){
            System.out.println("Erro ao editar curso "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM cursos WHERE id LIKE ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e){
            System.out.println("Erro ao exluir o curso. " + e.getMessage());
        }
    }
    
    public Curso getCurso(int id){
        String sql = "SELECT * FROM cursos WHERE id LIKE ?";
        // O * é para buscar todos os cursos com o mesmo id
        try {
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            // método para executar a busca
            ResultSet rs = stmt.executeQuery();
            
            // Pegar os dados que vem do ResultSet e criar uma instancia de Curso
            Curso curso = new Curso();            
            
            // Primeiro posicionar o ResulSet na primeira posição
            // Precisamos posicionar ele em primeiro para assim buscar as informações dentro dele
            
            while(rs.next()){
                //rs.getInt("id")
                curso.setId(id);
                curso.setNomecurso(rs.getString("nomecurso"));
                curso.setNivel(rs.getString("nivel"));
                curso.setDuracao(rs.getInt("duracao"));
            }
            return curso;                        
        } catch (Exception e){
            return null;
        }
    }
    
    public List<Curso> getCursos(String nomeCurso){
        // SELECT * FROM cursos WHERE nomecursos LIKE 'A%'  -> todos os cursos que começam com 'A'
        // SELECT * FROM cursos WHERE nomecursos LIKE '%o'  -> todos os cursos que terminam com 'o'
        // SELECT * FROM cursos WHERE nomecursos LIKE '%A%'  -> todos os cursos que possuem a letra 'A' em qualquer parte do texto
        String sql = "SELECT * FROM cursos WHERE nomecurso LIKE ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + nomeCurso + "%");
            ResultSet rs = stmt.executeQuery(); // Salva todos os cursos dentro da variavel rs
            List<Curso> listaCursos = new ArrayList<>();
            
            // Percorrendo o rs e salva as informações dentro de uma variavel Curso
            // e depois salva essa var da lista
            while(rs.next()){
                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setNomecurso(rs.getString("nomecurso"));
                curso.setNivel(rs.getString("nivel"));
                curso.setDuracao(rs.getInt("duracao"));
                listaCursos.add(curso);
            }            
            return listaCursos;            
        } catch(Exception e){
            return null;
        }
    }
    
}
