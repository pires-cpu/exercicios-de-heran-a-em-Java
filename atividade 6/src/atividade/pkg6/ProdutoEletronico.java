package atividade.pkg6;

public class ProdutoEletronico extends Produto{
    private int voltagem;
    
    public ProdutoEletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }
    
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    
    public int getVoltagem(){
        return voltagem;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Voltagem: " + getVoltagem() + "V");
    }
    
}