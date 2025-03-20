package Main.model;

abstract class Pessoa {

    private int matricula;
    private String nome;

    public Pessoa(int matricula,String nome) {
        this.nome = nome;
        this.matricula= matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }


}
