import java.util.Scanner;

public class TestaProduto {

    public static void main(String[] args){
	 
    Produto p1 = new Produto();
	Produto p2 = new Produto(456, "Notebook", 3.500);
	Produto p3 = new Produto(p2);
	
	
	int codProd = 123;
	String codDesc = "Celular";
	double codPreco = 1.200;
	
	p1.setCodigo(codProd);
	p1.setDescricao(codDesc);
	p1.setPreco(codPreco);
	
	
	System.out.println("Código do produto: " + p1.getCodigo());
    System.out.println("Descrição do produto: " + p1.getDescricao());
    System.out.println("Preço: " + p1.getPreco());
	
	System.out.println("Código do produto: " + p2.getCodigo());
    System.out.println("Descrição do produto: " + p2.getDescricao());
    System.out.println("Preço: " + p2.getPreco());
	
	System.out.println("Código do produto: " + p3.getCodigo());
    System.out.println("Descrição do produto: " + p3.getDescricao());
    System.out.println("Preço: " + p3.getPreco());
	
	}
}