/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 * 
 * 
 * @author Rafael
 */
public class Aluno {
    
    private int codAluno;
    private String nameAluno;
    private double mediaFinal;
    private int quantFaltas;

    public Aluno(int codAluno, String nameAluno) {
        this.codAluno = codAluno;
        this.nameAluno = nameAluno;
        mediaFinal = 0.0;
        quantFaltas = 0;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public String getNameAluno() {
        return nameAluno;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public int getQuantFaltas() {
        return quantFaltas;
    }
    
    public void addFaltas()
    {
        quantFaltas++;
    }
    
    public void addMedia(double media){
        mediaFinal = media;
    }
}
