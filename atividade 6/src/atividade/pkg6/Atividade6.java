package atividade.pkg6;

public class Atividade6 {

    public static void main(String[] args) {
    
           ProdutoEletronico  objPE = new ProdutoEletronico("smartphone", 5353.90, 21);
        objPE.exibirDados();
        
        System.out.println("");
        
        ProdutoAlimenticio objPA = new ProdutoAlimenticio("queijo", 2.09, "31/09/2026");
        objPA.exibirDados();

    }
    
}