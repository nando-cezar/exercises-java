/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ba.coursera.bean.User;
import br.ba.coursera.dao.UserDAO;
import java.util.List;
import org.dbunit.Assertion;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Windows
 */
public class TestUserDAO {

    JdbcDatabaseTester jdt;

    public TestUserDAO() {
    }

    @Before
    public void setUp() throws Exception {

        jdt = new JdbcDatabaseTester("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/coursera?useTimezone=true&serverTimezone=America/Sao_Paulo&useSSL=false",
                "root", "Pa$$w0rd");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        jdt.setDataSet(loader.load("/inicio.xml"));
        jdt.onSetup();
    }

    @Test
    public void insertUser() throws Exception {

        User u = new User();
        u.setLogin("Diego123");
        u.setName("Diego");
        u.setEmail("diego@teste.com.br");
        u.setPassword("9999");
        u.setPoints(90);
        new UserDAO().insert(u);

        IDataSet currentDataSet = jdt.getConnection().createDataSet();
        ITable currentTable = currentDataSet.getTable("USUARIO");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        IDataSet expectedDataSet = loader.load("/verifica.xml");
        ITable expectedTable = expectedDataSet.getTable("USUARIO");
        Assertion.assertEquals(expectedTable, currentTable);
    }
    
    @Test
    public void recovery() {
        
        User u = new UserDAO().recovery("Fernando123");
        assertEquals("Fernando123", u.getLogin());
    }
    
    @Test
    public void addPoints() throws Exception {
        
        new UserDAO().addPoints("Fernando123", 100);
        
        IDataSet currentDataSet = jdt.getConnection().createDataSet();
        ITable currentTable = currentDataSet.getTable("USUARIO");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        IDataSet expectedDataSet = loader.load("/verifica.xml");
        ITable expectedTable = expectedDataSet.getTable("USUARIO");
        Assertion.assertEquals(expectedTable, currentTable);
    }
    
    @Test
    public void ranking() {
        
        List<User> list = new UserDAO().ranking();
        assertEquals(4, list.size());
        assertEquals("Diego123", list.get(0).getLogin());
    }

    

}
