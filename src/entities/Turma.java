/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;




/**
 *  
 * @author Rafael
 */
public class Turma {

    private String nomeCursos;
    private int quantAulas;
    private Aluno[] aluno = new Aluno[20];
    private int quantAluno;

    public Turma(String nomeCursos, int quantAulas) {
        this.nomeCursos = nomeCursos;
        this.quantAulas = quantAulas;
        quantAluno = 0;
    }

    public int buscarAluno(int codigo) {
        for (int i = 0; i < quantAluno; i++) {
            if (codigo == aluno[i].getCodAluno()) {
                return i;
            }
        }

        return -1;
    }

    public void incluirAluno(Aluno al) throws Exception {

        if (quantAluno >= 19) {

            throw new Exception("Turma cheia");
            
        }
        if (buscarAluno(al.getCodAluno()) != -1) {
            
            throw new Exception("Aluno já matriculado neste curso");
        }
         else {
            aluno[quantAluno] = al;
            quantAluno++;
            System.out.println("------Matriculado com sucesso-------");
        }

    }

    public void registrarFalta(int codigo) throws Exception {

        if (buscarAluno(codigo) == -1) {
            throw new Exception("Aluno não existe");

        } else {
            aluno[buscarAluno(codigo)].addFaltas();
        }
    }

    public void atribuirMedia(int codigo, double media) throws Exception {

        
        if (buscarAluno(codigo) == -1) {
            throw new Exception("Aluno não existe");
        } else {
            aluno[buscarAluno(codigo)].addMedia(media);
        }
    }

    public void listarTodos() {

        System.out.println("\n----------- ESTUDANTES CADASTRADOS NO CURSO -----------");
        double frequencia = 0.0;
        double quantFt = 0.0;
        
        for (int i = 0; i < quantAluno; i++) {
            
            quantFt = aluno[i].getQuantFaltas();
            frequencia =  Math.abs(quantFt / quantAulas *100 - 100);
            System.out.println("\nNome do Curso : " + nomeCursos);
            System.out.println("Codigo do aluno: " + aluno[i].getCodAluno());
            System.out.println("Nome do aluno: " + aluno[i].getNameAluno());
            System.out.println("Nota final do aluno: " + aluno[i].getMediaFinal());
            System.out.println("Quantidade de faltas do aluno: " + aluno[i].getQuantFaltas());
            System.out.println("Frequencia do aluno: " + String.format("%.2f", frequencia) + "%");
        }
    }

    public void listarAprovados() {
        double frequencia = 0.0;
        double quantFt = 0.0;
        System.out.println("\n----------- APROVADOS -----------");
        for (int i = 0; i < quantAluno; i++) {
                
                quantFt = aluno[i].getQuantFaltas();
                frequencia =  Math.abs(quantFt / quantAulas *100 - 100);
            if (frequencia >= 75 && aluno[i].getMediaFinal() >= 6) {
                
                System.out.println("");
                System.out.println("Nome do Curso : " + nomeCursos);
                System.out.println("Codigo do aluno: " + aluno[i].getCodAluno());
                System.out.println("Nome do aluno: " + aluno[i].getNameAluno());
                System.out.println("Nota final do aluno: " + aluno[i].getMediaFinal());
                System.out.println("Quantidade de faltas do aluno: " + aluno[i].getQuantFaltas());
                System.out.println("Frequencia do aluno: " + String.format("%.2f", frequencia) + "%");
            }

        }

    }

}
