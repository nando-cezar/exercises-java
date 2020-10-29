/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Windows
 */
public class TesteUsuarioDAO {
    
    JdbcDatabaseTester jdt;
    
    public TesteUsuarioDAO() {
    }
    
    @Before
    public void setUp() throws Exception {
        
        jdt = new JdbcDatabaseTester("com.mysql.cj.jdbc.Driver", 
                "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=America/Sao_Paulo&useSSL=false", 
                "root", "Pa$$w0rd");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        jdt.setDataSet(loader.load("/inicio.xml"));
        jdt.onSetup();
    }
    
    @Test
    public void getAll() {
        List<Usuario> list = UsuarioDAO.getAll();
        assertEquals(2, list.size());
        assertEquals("teste1", list.get(0).getLogin());
    }
    
}
