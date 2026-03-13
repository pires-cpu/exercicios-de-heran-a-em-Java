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
public class Gerente extends Funcionario {
    private String departamento;
    
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }
            
}