package Main.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private String cargaHoraria;
    private List<Turma> turmasLista = new ArrayList<Turma>();

    public Professor(int matricula, String nome, String titulacao, String cargaHoraria, List<Turma> turmasLista) {
        super(matricula, nome);
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Titulação: " + titulacao + ", Carga Horária: " + cargaHoraria;
    }

}
