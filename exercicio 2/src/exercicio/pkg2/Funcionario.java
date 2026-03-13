/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author aluno.saolucas
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }  
}