/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void recoverAll() {
        List<Usuario> list = UsuarioDAO.getAll();
        assertEquals(1, list.size());
        assertEquals("Fernando123", list.get(0).getLogin());
    }

    @Test
    public void insertNew() throws Exception {

        Usuario usuario = new Usuario();
        usuario.setLogin("Lucas123");
        usuario.setNome("Lucas");
        usuario.setEmail("lucas@teste.com.br");
        
        UsuarioDAO.Create(usuario);
        
        IDataSet currentDataSet = jdt.getConnection().createDataSet();
        ITable currentTable = currentDataSet.getTable("USUARIO");      
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        IDataSet expectedDataSet = loader.load("/verifica.xml");
        ITable expectedTable = expectedDataSet.getTable("USUARIO");   
        Assertion.assertEquals(expectedTable, currentTable);
    }

}
