package usuarios;

public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

    @Override
    public String toString() {
        return "Administrador{}";
    }
}
