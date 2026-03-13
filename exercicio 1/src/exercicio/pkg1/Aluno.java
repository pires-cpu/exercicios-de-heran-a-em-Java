/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1;

/**
 *
 * @author aluno.saolucas
 */
public class Aluno extends Pessoa{
       private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void getStatus2(){
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
    }

        
    
}