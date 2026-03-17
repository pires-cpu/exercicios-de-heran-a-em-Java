/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cachorro objc1 = new Cachorro("tiago", 12);
        objc1.exibirDados();
        objc1.emitirSom();
        System.out.println("");
        Gato objg1 = new Gato("tirulipa", 1);
        objg1.exibirDados();
        objg1.emitirSom();

    }
    
}