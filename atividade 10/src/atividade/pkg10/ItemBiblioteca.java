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
public class ItemBiblioteca {
        private String titulo;
    private int anoPublicacao;
    
    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public void exibirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano da publicação: " + getAnoPublicacao());
    }
    
}