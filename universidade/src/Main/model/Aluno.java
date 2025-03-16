package Main.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String notaNoEnem;
    private String bolsaPorcentagem;
    private List<Turma> turmasLista = new ArrayList<Turma>();

    public Aluno(int matricula, String nome, String notaNoEnem, String bolsaPorcentagem, List<Turma> turmasLista) {
        super(matricula, nome);
        this.notaNoEnem = notaNoEnem;
        this.bolsaPorcentagem = bolsaPorcentagem;
        this.turmasLista = turmasLista;
    }

    public String getNotaNoEnem() {
        return notaNoEnem;
    }

    public void setNotaNoEnem(String notaNoEnem) {
        this.notaNoEnem = notaNoEnem;
    }

    public String getBolsaPorcentagem() {
        return bolsaPorcentagem;
    }

    public void setBolsaPorcentagem(String bolsaPorcentagem) {
        bolsaPorcentagem = bolsaPorcentagem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nota ENEM: " + notaNoEnem + ", Bolsa: " + bolsaPorcentagem;
    }


}
