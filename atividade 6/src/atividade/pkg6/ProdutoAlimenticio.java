/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg6;

    public class ProdutoAlimenticio extends Produto{
    private String dataValidade;
    
    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    
    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public String getDataValidade(){
        return dataValidade;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Data de validade: " + getDataValidade());
    }    
    
}