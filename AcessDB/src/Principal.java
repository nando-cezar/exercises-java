
public class Principal {

    public static void main(String[] args) throws Exception {

        UsuarioDAO.getAll().forEach(System.out::println);

        Usuario usuario = new Usuario();
        usuario.setLogin("Fernando123");
        usuario.setNome("Fernando");
        usuario.setEmail("fernando@teste.com.br");
        UsuarioDAO.Create(usuario);
        
        UsuarioDAO.getAll().forEach(System.out::println);

    }

}
