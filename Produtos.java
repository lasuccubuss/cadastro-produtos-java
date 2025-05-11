public class Produtos {
   private String nome;
   private double preco;
   private int quantidade;
   
   public void setNome(String nome){
	   this.nome = nome;
   }
    public String getNome(){
		return nome;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public boolean estoqueAbaixo(){

		if((preco * quantidade) < 5000){
			return true;
		} else {
			return false;
		}
	 }
	 
	 public double reposicaoNecessaria(){
		 int quantidadeFaltando;
		 double custoReposicao;
		 
        if(quantidade < 20){
			quantidadeFaltando = 20 - quantidade;
			return custoReposicao = quantidadeFaltando * preco;
		}
			else {
				return 0.0;
			}
		}		 
	 }