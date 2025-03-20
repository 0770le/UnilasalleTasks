package Main;

import Main.model.Professor;
import Main.model.Aluno;
import Main.model.Disciplina;
import Main.model.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instanciando Aluno
        List<Turma> turmasAluno = new ArrayList<>();
        System.out.print("Digite o nome do Aluno 1: ");
        String nomeAluno1 = scanner.nextLine();
        System.out.print("Digite a nota no ENEM do Aluno 1: ");
        String notaEnemAluno1 = scanner.nextLine();
        System.out.print("Digite a porcentagem de bolsa do Aluno 1: ");
        String bolsaAluno1 = scanner.nextLine();
        Aluno aluno1 = new Aluno(1, nomeAluno1, notaEnemAluno1, bolsaAluno1, turmasAluno);

        System.out.print("Digite o nome do Aluno 2: ");
        String nomeAluno2 = scanner.nextLine();
        System.out.print("Digite a nota no ENEM do Aluno 2: ");
        String notaEnemAluno2 = scanner.nextLine();
        System.out.print("Digite a porcentagem de bolsa do Aluno 2: ");
        String bolsaAluno2 = scanner.nextLine();
        Aluno aluno2 = new Aluno(2, nomeAluno2, notaEnemAluno2, bolsaAluno2, turmasAluno);

        // Instanciando Professor
        List<Turma> turmasProfessor = new ArrayList<>();
        System.out.print("Digite o nome do Professor 1: ");
        String nomeProfessor1 = scanner.nextLine();
        System.out.print("Digite a titulação do Professor 1: ");
        String titulacaoProfessor1 = scanner.nextLine();
        System.out.print("Digite a carga horária do Professor 1: ");
        String cargaHorariaProfessor1 = scanner.nextLine();
        Professor professor1 = new Professor(3, nomeProfessor1, titulacaoProfessor1, cargaHorariaProfessor1, turmasProfessor);

        System.out.print("Digite o nome do Professor 2: ");
        String nomeProfessor2 = scanner.nextLine();
        System.out.print("Digite a titulação do Professor 2: ");
        String titulacaoProfessor2 = scanner.nextLine();
        System.out.print("Digite a carga horária do Professor 2: ");
        String cargaHorariaProfessor2 = scanner.nextLine();
        Professor professor2 = new Professor(4, nomeProfessor2, titulacaoProfessor2, cargaHorariaProfessor2, turmasProfessor);

        // Instanciando Disciplina
        System.out.print("Digite o nome da Disciplina 1: ");
        String nomeDisciplina1 = scanner.nextLine();
        System.out.print("Digite a carga horária da Disciplina 1: ");
        String cargaHorariaDisciplina1 = scanner.nextLine();
        Disciplina disciplina1 = new Disciplina(101, nomeDisciplina1);
        disciplina1.setCargaHoraria(cargaHorariaDisciplina1);

        System.out.print("Digite o nome da Disciplina 2: ");
        String nomeDisciplina2 = scanner.nextLine();
        System.out.print("Digite a carga horária da Disciplina 2: ");
        String cargaHorariaDisciplina2 = scanner.nextLine();
        Disciplina disciplina2 = new Disciplina(102, nomeDisciplina2);
        disciplina2.setCargaHoraria(cargaHorariaDisciplina2);

        // Instanciando Turma
        Turma turma1 = new Turma(201);
        System.out.print("Digite o semestre da Turma 1: ");
        turma1.setSemestre(scanner.nextLine());
        System.out.print("Digite o dia da Turma 1: ");
        turma1.setDia(scanner.nextLine());
        System.out.print("Digite o horário da Turma 1: ");
        turma1.setHorario(scanner.nextLine());
        System.out.print("Digite a sala da Turma 1: ");
        turma1.setSala(scanner.nextLine());

        Turma turma2 = new Turma(202);
        System.out.print("Digite o semestre da Turma 2: ");
        turma2.setSemestre(scanner.nextLine());
        System.out.print("Digite o dia da Turma 2: ");
        turma2.setDia(scanner.nextLine());
        System.out.print("Digite o horário da Turma 2: ");
        turma2.setHorario(scanner.nextLine());
        System.out.print("Digite a sala da Turma 2: ");
        turma2.setSala(scanner.nextLine());

        scanner.close();

        // Exibindo informações
        System.out.println("\n\n\n\n");
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(professor1.toString());
        System.out.println(professor2.toString());
        System.out.println(disciplina1.toString());
        System.out.println(disciplina2.toString());
        System.out.println(turma1.toString());
        System.out.println(turma2.toString());
    }
}

