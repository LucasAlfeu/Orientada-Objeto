/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author a1feu
 */
public class Conexao {
    
    public Connection getConexao(){
        try{
            // tentar se conectar
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3308/projetojava?serverTimezone=UTC", // Linha de conexão
                    "root", // Usuário do mysql
                    "1234567"  // Senha do my sql           
            );
            return conn;
        } catch (Exception e){
            // se deu errado na hora de conectar
            System.out.println("Erro ao conectar " + e.getMessage());
            return null;
        }
    }
}
