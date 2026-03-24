/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg5;

/**
 *
 * @author aluno.saolucas
 */
public class Professor extends Pessoa{
    private String disciplina;
    
    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    public String getDisciplina(){
        return disciplina;
    }   
    
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Disciplina: " + getDisciplina());
    }
    
}