/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Aluno;
import beans.Curso;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author a1feu
 */
public class AlunoDAO {
    //Classe de Objeto de Acesso aos Dados
    // Classe que faz conexão com o a tabela cursos do BD
    
    private Conexao conexao;
    private Connection conn;
    
    public AlunoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Aluno aluno){
        String sql = "INSERT INTO alunos(nomealuno, cursoid) VALUES " // precisa ter o mesmo nome da tabela no BD
                + "(?,?)"; // o número de ? depende do numero de parametros no insert
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            //stmt.setInt(1, curso.getId());
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setInt(2, aluno.getCursoId().getId());
            // Executar a query
            stmt.execute(); // Roda ese comando mo mysql
        } catch(Exception e){
            System.out.println("Erro ao inserir aluno "+ e.getMessage());
        }
    }
    
    public void editar(Aluno aluno){
        String sql = "UPDATE alunos SET nomealuno=?, cursoid=? WHERE id=?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setInt(2, aluno.getCursoId().getId());
            
            stmt.execute();
        } catch (Exception e){
            System.out.println("Erro ao editar curso "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM alunos WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e){
            System.out.println("Erro ao exluir o aluno. " + e.getMessage());
        }
    }
    
    public Aluno getAluno(int id){
        String sql = "SELECT * FROM alunos WHERE id = ?";
        // O * é para buscar todos os cursos com o mesmo id
        try{            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            // método para executar a busca
            ResultSet rs = stmt.executeQuery();
            
            // Pegar os dados que vem do ResultSet e criar uma instancia de Curso
            Aluno aluno = new Aluno();            
            
            // Primeiro posicionar o ResulSet na primeira posição
            // Precisamos posicionar ele em primeiro para assim buscar as informações dentro dele
            
            while(rs.next()){
                aluno.setId(id);
                aluno.setNomeAluno(rs.getString("nomealuno"));
                Curso cursoId = new Curso();
                cursoId.setId(rs.getInt("cursoid"));
                aluno.setCursoId(cursoId);
            }
            return aluno; 
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }
    
    
}
