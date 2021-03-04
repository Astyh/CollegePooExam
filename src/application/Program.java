/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Aluno;
import entities.Turma;

/**
 * 
 * 
 * @author Rafael
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno[] aluno = new Aluno[20];
        Turma turmaJogos = new Turma("Jogos Digitais", 20);
        Turma turmaAdm = new Turma("Adm", 30);
        Turma turmaAds = new Turma("ADS", 20);

        try {

            aluno[0] = new Aluno(111, "Rafael");
            aluno[1] = new Aluno(222, "Elson");
            aluno[2] = new Aluno(333, "Breno");
            aluno[3] = new Aluno(444, "Bob");
            aluno[4] = new Aluno(555, "Maria");
            aluno[5] = new Aluno(111, "Rafael");
            
            
            turmaJogos.incluirAluno(aluno[0]);
            turmaJogos.incluirAluno(aluno[1]);
            turmaJogos.incluirAluno(aluno[2]);
            turmaAdm.incluirAluno(aluno[3]);
            turmaJogos.incluirAluno(aluno[4]);
            turmaJogos.incluirAluno(aluno[5]);
            
            
            
            
            //

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        
        try {
            
            turmaJogos.atribuirMedia(111, 10);    
            turmaJogos.atribuirMedia(222, 10);
            
            for(int i=0; i < 14; i++){
                turmaJogos.registrarFalta(222);
            }
            
            turmaJogos.atribuirMedia(333, 5.5); 
            turmaJogos.listarTodos();
            turmaJogos.listarAprovados();
            
        } catch (Exception e) {
        
            System.out.println("");
        }
        
    }

}
