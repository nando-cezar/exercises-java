/*
 * BANCO DE DADOS - SISTEMA DE GESTÃO ESCOLAR (SGE)
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Nando_Cezar
 */
public class ConnectionFactory {
    
    /* Definindo atributos de conexão */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL    = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=America/Sao_Paulo";
    private static final String USER   = "root";
    private static final String PASS   = "Pa$$w0rd";
    
    /*      ABRINDO CONEXÃO      */
    public static Connection getConnection(){ 
    
        try {
            Class.forName(DRIVER); /* Aplicando metodo da classe 'Class' presente na biblioteca DRIVER - JDBC*/
            return DriverManager.getConnection(URL, USER, PASS);/*Abrindo Conexão*/
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão!!!", ex);
        }
    }
    
    /*      FECHANDO CONEXÃO      */
    public static void closeConnection(Connection conn){
        
        if (conn != null){
            try {
                conn.close(); /* Fechando Conexão */
            } catch (SQLException ex) {
                System.err.println("Erro na conexão!!!"+ex);    
            }
        }
    }
    /*      FECHANDO CONEXÃO      */
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        
        if (stmt != null){
            try {
                stmt.close();/* Fechando Conexão*/
            } catch (SQLException ex) {
                System.err.println("Erro na conexão!!!"+ex);
            }
        }
        closeConnection(conn);
    }
    /*      FECHANDO CONEXÃO      */
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        
        if (rs != null){
            try {
                rs.close(); /* Fechando Conexão*/
            } catch (SQLException ex) {
                System.err.println("Erro na conexão!!!"+ex);
            }
        }
        closeConnection(conn, stmt);
    }
                              
}
