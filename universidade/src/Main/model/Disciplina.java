package Main.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int codigo;
    private String nome;
    private String cargaHoraria;
    private List<Turma> turmasLista = new ArrayList<Turma>();

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", turmasLista=" + turmasLista +
                '}';
    }

}
