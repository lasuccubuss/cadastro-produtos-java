import java.util.Scanner;

public class TestaProdutos {

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);//Cria o Scanner 
	String nomeProduto = "";
	int valorEstoque;
	
	System.out.println("Programa iniciado com sucesso!");

	
	//Scanner menu = new Scanner(System.in)//Scanner do menu
	
	Produtos produtos = new Produtos();//Cria o objeto
	
	//System.out.println("Digite o nome do produto: ");
	//String digita = sc.nextLine();//Lê o nome digitado
	
	//produtos.setNome(digita);//Guarda esse nome no objeto
	
	
	//System.out.println("Digite o valor do preço: " );
	
	//String entraPreco = sc.nextLine();
	//double digitaPreco = Double.parseDouble(entraPreco);//converte string para double
	
	//produtos.setPreco(digitaPreco);
	
	
	
	//System.out.println("Digite a quantidade: ");
	
	//String entraQuantidade = sc.nextLine();
	//int digitaQuantidade = Integer.parseInt(entraQuantidade);
	
	//produtos.setQuantidade(digitaQuantidade);
	System.out.println("Entrando no loop...");

		
		int opcao = -1;
		while(opcao != 0){
		
			System.out.println("1 - Cadastrar Produtos");
			System.out.println("2 - Verificar estoque");
			System.out.println("3 - Calcular reposição");
			System.out.println("0 - Sair");
						
			
			System.out.println("Opção digitada: " + opcao);
			
		   opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
        case 1:
		
		  
		    System.out.print("\nDigite o nome do produto ");
			nomeProduto = sc.nextLine();
			produtos.setNome(nomeProduto);
            System.out.print("\nOpção Produto cadastrado");
			
			System.out.print("Digite o preço: ");
			String precoProduto = sc.nextLine();
			double precoConvertido = Double.parseDouble(precoProduto);
			produtos.setPreco(precoConvertido);
			
			System.out.print("Digite a quantidade: ");
			String quantidadeProduto = sc.nextLine();
			int quantidadeConvertida = Integer.parseInt(quantidadeProduto);
			produtos.setQuantidade(quantidadeConvertida);
			
			System.out.println("Produto cadastrado com sucesso! ");
			
            break;
			
		case 2:
			
		    produtos.estoqueAbaixo();
		    if(produtos.estoqueAbaixo()){
			System.out.println("Abaixo do ideal! ");
		   }
			else{
				System.out.println("Estoque saudável! ");
		    }
		
		break;
		
		case 3:
				
		   double valorReposicao = produtos.reposicaoNecessaria();
		   System.out.print("Resultado: " + valorReposicao);
		
            break;
		}
		

	}
		sc.close();
  }
}
