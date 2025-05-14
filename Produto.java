public class Produto{
   
   private int codigo;
   private String descricao;
   private double preco;
   
   public Produto(){
	   
   }   
   
   public Produto(int codigo, String descricao, double preco){
	   this.codigo = codigo;
	   this.descricao = descricao;
	   this.preco = preco;
   }
   
   public Produto(Produto produto){
	   this.codigo = produto.getCodigo();
	   this.descricao = produto.getDescricao();
	   this.preco = produto.getPreco();
   }
   
   public void setCodigo(int codigo){
	   this.codigo = codigo;
   }
   
   public void setDescricao(String descricao){
	   this.descricao = descricao;
   }
   public void setPreco(double preco){
	   this.preco = preco;
   }
   
   public int getCodigo(){
	   return codigo;
   }
   public String getDescricao(){
	   return descricao;
   }
   public double getPreco(){
	   return preco;
   }
}