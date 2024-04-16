package usuarios;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;

public class Medico extends Usuario{
    private Spring especializacao;
    private Spring CRM;

    public Medico() {
    }

    public Medico(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

    public Medico(Spring especializacao, Spring CRM) {
        this.especializacao = especializacao;
        this.CRM = CRM;
    }

    public Medico(String nome, String usuario, String senha, Spring especializacao, Spring CRM) {
        super(nome, usuario, senha);
        this.especializacao = especializacao;
        this.CRM = CRM;
    }

    public Spring getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Spring especializacao) {
        this.especializacao = especializacao;
    }

    public Spring getCRM() {
        return CRM;
    }

    public void setCRM(Spring CRM) {
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especializacao=" + especializacao +
                ", CRM=" + CRM +
                '}';
    }
}
