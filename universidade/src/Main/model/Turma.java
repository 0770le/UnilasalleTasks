package Main.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private String semestre;
    private String dia;
    private String horario;
    private String sala;
    private List<Aluno> alunosLista = new ArrayList<Aluno>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Turma(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Turma{" +
                "codigo=" + codigo +
                ", semestre='" + semestre + '\'' +
                ", dia='" + dia + '\'' +
                ", horario='" + horario + '\'' +
                ", sala='" + sala + '\'' +
                ", alunosLista=" + alunosLista +
                '}';
    }


}
