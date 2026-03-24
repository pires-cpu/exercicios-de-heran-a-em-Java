/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg10;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Livro objL = new Livro("pequeno principe", 1900, "divina comédia");
        objL.exibirDados();
        
        System.out.println("");
        
        Revista objR = new Revista("Revista de Engenharia", 32, "SILVA, A. B. Estudos Técnicos");
        objR.exibirDados();

    } 
}