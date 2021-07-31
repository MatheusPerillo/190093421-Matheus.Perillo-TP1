import java.util.ArrayList;
import java.util.Scanner;

public class Lojinha {

	public static void main(String[] args) {
		int qtdeDeClientes = 0;
		int qtdeEmEstoque = 0;
		int i = 0;
		int choice; // usado para o menu de opções
		int choice2; // usado na alteração dos dados do cliente
		int choice3; // usado na alteração dos dados do produto
		int choice4; // usado para cadastro de vendas
		int subRealizada; // usado para registrar a subtração do cadastro de vendas
		String clients = null;

		Scanner ler = new Scanner(System.in);

		// Listas que serão usadas!
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Matheus");
		nome.add("Isabella");
		nome.add("Luiz");
		nome.add("Davi");
		nome.add("Thiago");
		nome.add("João");
		nome.add("Júlia");
		nome.add("Lucas");
		nome.add("Pedro");
		nome.add("Renato");

		ArrayList<String> endereco = new ArrayList<>();
		endereco.add("Guará I");
		endereco.add("Guará II");
		endereco.add("Asa Norte");
		endereco.add("Asa Sul");
		endereco.add("Lago Sul");
		endereco.add("Lago Norte");
		endereco.add("Águas Claras");
		endereco.add("Taguatinga");
		endereco.add("Samambaia");
		endereco.add("Valparaíso");

		ArrayList<String> telefone = new ArrayList<>();
		telefone.add("97641352");
		telefone.add("12345678");
		telefone.add("87654321");
		telefone.add("75272141");
		telefone.add("64274535");
		telefone.add("78967852");
		telefone.add("31237988");
		telefone.add("97524217");
		telefone.add("21585525");
		telefone.add("98375721");

		ArrayList<String> nomeProduto = new ArrayList<>();
		nomeProduto.add("Controle Xbox");
		nomeProduto.add("Headset");
		nomeProduto.add("Mouse Gamer");
		nomeProduto.add("Monitor");
		nomeProduto.add("Teclado");
		nomeProduto.add("Mousepad");
		nomeProduto.add("Televisão");
		nomeProduto.add("Console Xbox");
		nomeProduto.add("Microfone");
		nomeProduto.add("Webcam");

		ArrayList<String> descricaoProduto = new ArrayList<>();
		descricaoProduto.add("Controle para o console Xbox One X; Cor: Preto; Conexão: Sem fio;");
		descricaoProduto.add(
				"Headset Gamer HyperX Stinger; Cor: Preto e vermelho; Conexão: Cabo com de 2 metros de comprimento; Som Surround Virtual 7.1;");
		descricaoProduto.add(
				"Mouse Gamer Logitech; Modelo: G403 Hero; Conexão: Com cabo de 1.2 metros de comprimento; DPI: 16000; 6 botões;");
		descricaoProduto.add("Monitor Gamer Acer; 144Hz; 1ms; 23,5 polegadas;");
		descricaoProduto.add("Teclado Razer Chroma; Mecânico; Óptico; RGB;");
		descricaoProduto.add("Mousepad Gamer HyperX; Speed; 80cm x 40cm;");
		descricaoProduto.add("Televisão Samsung 4K; 40 polegadas; SmarTV;");
		descricaoProduto.add("Console Xbox One X; 1T; 4k; 2 controles inclusos;");
		descricaoProduto.add("Microfone HyperX; Condensador QuadCast; Impedância: 32; Peso: 254g;");
		descricaoProduto.add("Webcam UltraHD 4K; Logitech; 60fps");

		ArrayList<String> valorProduto = new ArrayList<>();
		valorProduto.add("R$ 399,90");
		valorProduto.add("R$ 329,99");
		valorProduto.add("R$ 199,90");
		valorProduto.add("R$ 1200,00");
		valorProduto.add("R$ 400,90");
		valorProduto.add("R$ 99,90");
		valorProduto.add("R$ 1499,90");
		valorProduto.add("R$ 2500,90");
		valorProduto.add("R$ 1319,79");
		valorProduto.add("R$ 350,900");

		ArrayList<String> percentageLucro = new ArrayList<>();
		percentageLucro.add("9%");
		percentageLucro.add("5%");
		percentageLucro.add("3%");
		percentageLucro.add("11%");
		percentageLucro.add("8%");
		percentageLucro.add("1%");
		percentageLucro.add("13%");
		percentageLucro.add("20%");
		percentageLucro.add("12%");
		percentageLucro.add("2%");

		ArrayList<Integer> qtdeEstoque = new ArrayList<Integer>();
		qtdeEstoque.add(1000);
		qtdeEstoque.add(850);
		qtdeEstoque.add(1050);
		qtdeEstoque.add(950);
		qtdeEstoque.add(1086);
		qtdeEstoque.add(1528);
		qtdeEstoque.add(1009);
		qtdeEstoque.add(1458);
		qtdeEstoque.add(2483);
		qtdeEstoque.add(1519);

		// MENU DE OPÇÕES
		do {
			System.out.println("      MENU DE OPÇÕES");
			System.out.println(
					"1. Cadastro de novo cliente\n2. Busca por cliente\n3. Cadastro de novo produto\n4. Busca por produto\n5. Cadastro de venda\n6. Mostrar produtos em estoque\n7. Sair");

			choice = ler.nextInt();
			ler.nextLine();
			switch (choice) {

			// Cadastrar novos clientes
			case 1:

				System.out.print("\n");
				System.out.print("Quantos clientes serão cadastrados? ");
				qtdeDeClientes = ler.nextInt();
				ler.nextLine();

				for (i = 0; i < qtdeDeClientes; i++) {
					System.out.print("Digite o nome: ");
					clients = ler.nextLine();

					System.out.print("Digite o endereço: ");
					String end = ler.nextLine();

					System.out.print("Digite o telefone: ");
					String numero = ler.nextLine();

					nome.add(clients);
					endereco.add(end);
					telefone.add(numero);
					System.out.println("\nCliente cadastrado!\n");
				}
				break;

			// Busca por cliente
			case 2:
				System.out.print("\n");
				System.out.print("Digite o nome do cliente: ");
				clients = ler.nextLine();

				if (nome.contains(clients)) {
					System.out.print("\n");
					System.out.println("Cliente encontrado! Abaixo serão exibidos os dados do cliente.");

					nome.get(nome.indexOf(clients));
					System.out.println("Nome: " + nome.get(nome.indexOf(clients)));

					endereco.get(nome.indexOf(clients));
					System.out.println("Endereço: " + endereco.get(nome.indexOf(clients)));

					telefone.get(nome.indexOf(clients));
					System.out.println("Telefone: " + telefone.get(nome.indexOf(clients)));

					System.out.print("\n");

					// Alterar dados do cliente
					do {

						System.out
								.println("\nDeseja alterar os dados cadastrados deste cliente? Escolha:\n1. Sim\n2. Não");

						choice2 = ler.nextInt();
						ler.nextLine();
						switch (choice2) {

						case 1:
							// Nome do cliente alterado
							System.out.print("\nDigite o novo nome do cliente: ");
							clients = ler.nextLine();
							nome.set(indexOf(clients), clients);

							// Endereço do cliente alterado
							System.out.print("Digite o novo endereco do cliente: ");
							String end = ler.nextLine();
							endereco.set(indexOf(clients), end);

							// Telefone do cliente alterado
							System.out.print("Digite o novo número do cliente: \n");
							String numero = ler.nextLine();
							telefone.set(indexOf(clients), numero);

							break;

						case 2:
							System.out.println("\nOperação cancelada pelo usuário!\n");
							break;
						}

					} while (choice2 != 2);
					// Fim de alterar dados do cliente

				} else {
					System.out.println("Cliente não encontrado!\n");
				}

				break;

			// Cadastro de novo produto
			case 3:
				System.out.print("\n");
				System.out.print("Quantos produtos serão cadastrados? ");
				qtdeEmEstoque = ler.nextInt();
				System.out.print("\n");
				ler.nextLine();

				for (int aux = 0; aux < qtdeEmEstoque; aux++) {

					System.out.print("Digite o nome do produto: ");
					String leiaProduto = ler.nextLine();

					System.out.print("Descrição do produto: ");
					String leiaDescricao = ler.nextLine();

					System.out.print("Digite o valor do produto em R$: ");
					String leiaValor = ler.nextLine();

					System.out.print("Digite a porcentagem de lucro sobre o produto: ");
					String leiaPercent = ler.nextLine();

					System.out.print("Digite a quantidade em estoque do produto: ");
					Integer leiaEstoque = ler.nextInt();

					System.out.print("\n");
					
					nomeProduto.add(leiaProduto);
					descricaoProduto.add(leiaDescricao);
					valorProduto.add(leiaValor);
					percentageLucro.add(leiaPercent);
					qtdeEstoque.add(leiaEstoque);
					System.out.println("Produto cadastrado!\n");

				}

				break;

			// Busca por produto
			case 4:
				System.out.print("\n");
				System.out.print("Digite o nome do produto: ");
				String leiaProduto = ler.nextLine();

				if (nomeProduto.contains(leiaProduto)) {
					
					System.out.println("Produto encontrado! Abaixo serão exibidos os dados do produto.\n");

					nomeProduto.get(nomeProduto.indexOf(leiaProduto));
					System.out.println("Nome: " + nomeProduto.get(nomeProduto.indexOf(leiaProduto)));

					descricaoProduto.get(nomeProduto.indexOf(leiaProduto));
					System.out.println("Descrição: " + descricaoProduto.get(nomeProduto.indexOf(leiaProduto)));

					valorProduto.get(nomeProduto.indexOf(leiaProduto));
					System.out.println("Valor: " + valorProduto.get(nomeProduto.indexOf(leiaProduto)));

					percentageLucro.get(nomeProduto.indexOf(leiaProduto));
					System.out
							.println("Porcentagem de lucro: " + percentageLucro.get(nomeProduto.indexOf(leiaProduto)));

					qtdeEstoque.get(nomeProduto.indexOf(leiaProduto));
					System.out.println("Em estoque: " + qtdeEstoque.get(nomeProduto.indexOf(leiaProduto)) + " un.");
					System.out.print("\n");

					// Alterar dados do produto
					do {
						System.out
								.println("Deseja alterar os dados cadastrados deste produto? Escolha:\n1. Sim\n2. Não");

						choice3 = ler.nextInt();
						ler.nextLine();
						System.out.print("\n");
						switch (choice3) {

						case 1:
							// Nome do produto alterado
							System.out.print("Digite o novo nome do produto: ");
							leiaProduto = ler.nextLine();
							nomeProduto.set(indexOf(leiaProduto), leiaProduto);

							// Nome da descrição alterado
							System.out.print("Digite a nova descrição do produto: ");
							String leiaDescricao = ler.nextLine();
							descricaoProduto.set(indexOf(leiaProduto), leiaDescricao);

							// Valor do produto alterado
							System.out.print("Digite o novo valor do produto em R$: ");
							String leiaValor = ler.nextLine();
							valorProduto.set(indexOf(leiaProduto), leiaValor);

							// % de lucro alterado
							System.out.print("Digite a nova % de lucro sobre o produto: ");
							String leiaPercent = ler.nextLine();
							percentageLucro.set(indexOf(leiaProduto), leiaPercent);

							// Qtde em estoque alterado
							System.out.print("Digite a nova quantidade em estoque do produto: \n");
							
							Integer leiaEstoque = ler.nextInt();
							qtdeEstoque.set(indexOf(leiaProduto), leiaEstoque);

							break;

						case 2:
							System.out.println("Operação cancelada pelo usuário!\n");

						}

					} while (choice3 != 2);
					// Fim de alterar dados do produto

				} else {
					System.out.println("Produto não encontrado!\n");
				}

				break;

			// Cadastro de venda
			case 5:
				
				System.out.println("\nDigite o número do cliente: \n");

				for (int var3 = 0; var3 < nome.size(); var3++) {

					System.out.println(var3 + "." + " " + nome.get(var3));
				}
				clients = ler.nextLine();
				System.out.print("\n");
				
				do {
					System.out.println("Selecione um produto: \n");

					for (int var4 = 0; var4 < nomeProduto.size(); var4++) {

						System.out.println(var4 + "." + " " + nomeProduto.get(var4));
					}
					int x = ler.nextInt();
					System.out.print("\n");
					
					System.out.println("Quantas unidades deste produto foram vendidas para este cliente?");

					int qtdeDigitada = ler.nextInt();
					ler.nextLine();
					subRealizada = qtdeEstoque.get(x) - qtdeDigitada;
					qtdeEstoque.set(x, subRealizada);
					System.out.print("\n");
					System.out.println(
							"Deseja cadastrar mais alguma venda para este cliente? Digite (1) Continuar ou (2) Sair.");

					choice4 = ler.nextInt();
					System.out.print("\n");
				} while (choice4 != 2);

				break;

			// Mostrar produtos em estoque
			case 6:
				System.out.println("\nLISTA DE PRODUTOS CADASTRADOS: \n");

				for (int var5 = 0; var5 < nomeProduto.size(); var5++) {

					System.out.println(var5 + "." + " " + nomeProduto.get(var5) + "\n   Estoque..............: " + qtdeEstoque.get(var5) + " un." + "\n");
				}
				System.out.print("\n");
				
				break;
				
			// Sair
			case 7:
				System.out.println("\nPrograma encerrado. Obrigado!");
				break;

			}

		} while (choice != 7);

	}

	private static int indexOf(String clients) {
		return 0;
	}
}