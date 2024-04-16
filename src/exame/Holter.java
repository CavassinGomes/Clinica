package exame;

public class Holter {
    private String observacoes;

    public Holter() {
    }

    public Holter(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Holter{" +
                "observacoes='" + observacoes + '\'' +
                '}';
    }
}
