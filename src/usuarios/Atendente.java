package usuarios;

public class Atendente extends Usuario{
    public Atendente() {
    }

    public Atendente(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

    @Override
    public String toString() {
        return "Atendente{}";
    }
}
