package paciente;

import java.util.Date;

public class Paciente {
    private String nome;
    private String CPF;
    private Date dataNasc;
    private String RG;
    private String sexo;
    private Integer telefone;

    public Paciente() {
    }

    public Paciente(String nome, String CPF, Date dataNasc, String RG, String sexo, Integer telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        this.RG = RG;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", dataNasc=" + dataNasc +
                ", RG='" + RG + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
