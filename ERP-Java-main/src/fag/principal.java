package fag;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.*;

public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Mesa> listaMesas = new ArrayList<Mesa>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		List<Cardapio> listaCardapio = new ArrayList<Cardapio>();
		
		listaFuncionarios.add(new Funcionario("Kaique",5,1));
		listaMesas.add(new Mesa("5","2",1));
		Pedido novoPedido;
		
		
		ArrayList<CardapioBebidas> listaCardapioBebidas = new ArrayList<CardapioBebidas>();
		
		// Ainda vai ser implementado a parte de limitar acesso conforme o antigo principal_old.java
		System.out.println("Olá, oque deseja fazer:\n");
		boolean flagLoop = true;
		while(flagLoop) {
			System.out.println("----------------------------\n");
			System.out.println("[1] Gerenciar funcionários\n"
					 + "[2] Gerenciar mesas\n"
					 + "[3] Gerenciar cardapio\n"
					 + "[4] Gerenciar pedidos\n"
					 + "[5] Extrair relatórios\n"
					 + "[6] Sair\n"
					 + "----------------------------");
			Integer opcaoMenu = scan.nextInt();
			switch (opcaoMenu) {
				case 1:
					// Gerenciar funcionários
					// Implementar as funções criadas CadastraCarcom e demais para gerenciar os funcionários,
					// Eles devem ser listados na lista ListaMesas
					int escolha;
					System.out.println("[1] Mostrar Funcionários\n"+"[2] Adicionar Funcionário\n[3] Excluir Funcionario");
					escolha = scan.nextInt();
					
					if (escolha == 1) {
						for(Funcionario listaf : listaFuncionarios){
							System.out.println(listaf);
							break;
							} 
					}else if (escolha == 2) {
						System.out.println("Nome:");
						String nome = scan.next();
						System.out.println("Escolha o cargo:\n[1] Garçom\n[2] Cozinheiro\n[3] Gerente");
		                int cargo = scan.nextInt();
		                int novoId = listaFuncionarios.size() + 1;
		                listaFuncionarios.add(new Funcionario(nome, novoId, cargo));
		                System.out.println("Funcionário adicionado com sucesso.");
		                break;
					} else if (escolha == 3 ) {
						System.out.println("Insira o nome do funcionario corretamente");
						String nome = scan.next();
						String removenome = "";
						boolean encontrado = false;
						for (int i = 0; i < listaFuncionarios.size(); i++) {
						    if (listaFuncionarios.get(i).getNome().equals(removenome)) {
						        listaFuncionarios.remove(i);
						        encontrado = true;
						        System.out.println("Item removido com sucesso!");
						        break;
						    } else {
							    System.out.println("Funcionário não encontrado.");}
							}
						}
					break;
				case 2:
					System.out.println("[1] Mostrar Mesas\n[2] Adicionar Mesa\n[3] Atualizar Mesa\n");
					int escolhamesa = scan.nextInt();
					if (escolhamesa == 1) {
						for(Mesa listamesa : listaMesas) {
							System.out.println(listamesa);
						}
					}
						
					if (escolhamesa == 2) {
						System.out.println("Número da Mesa");
						String mesa = scan.next();
						System.out.println("Capacidade da mesa");
						String capacidadepessoa = scan.next();
						System.out.println("Informe a Disponibilidade da mesa: \n[1] Disponível\n [2] Ocupada\n");
						int disponibilidade = scan.nextInt();
						
						listaMesas.add(new Mesa(mesa, capacidadepessoa, disponibilidade));
						
						System.out.println("Mesa adicionada com sucesso.");
					}
					if (escolhamesa == 3) {
					    System.out.println("Informe o número da mesa.");
					    String Nmesa = scan.next();
					    boolean encontrado = false;

					    for (int i = 0; i < listaMesas.size(); i++) {
					        if (listaMesas.get(i).getNumeromesa().equals(Nmesa)) 
					        {
					            System.out.println("A mesa está \n[1] Disponível\n[2] Ocupada");
					            
					            int novaDisponibilidade = scan.nextInt();
					            boolean novaDispBool = (novaDisponibilidade == 1);
					            
					            listaMesas.get(i).setDisponibilidade(novaDispBool);
					            encontrado = true;
					            System.out.println("Mesa atualizada!");
					        }
					    }
					    if (!encontrado) {
					        System.out.println("Mesa não encontrada.");
					    	}
						}
					break;
				case 3:
					// Gerenciar cardapio
					// Implementar função para gerenciar o cardapio, como cadastrar itens e mudar a disponibilidade
					// Opção de mudar status de cardapio ficou dentro das opções de pedido
					System.out.println("Escolha uma opção que deseja:\n "
					+ "[1]Cadastrar pratos "
					+ "\n [2]Cadastrar bebidas "
					+ "\n [3]Remover item "
					+ "\n [4]Atualizar disponibilidade");
								
					int cadinput = scan.nextInt();
					switch (cadinput) {
						case 1: 
							System.out.println("Escreva o nome do prato:");
							String nomePrato = scan.next();
							System.out.println("Escreva o codigo do item:");
							int codPrato = scan.nextInt();
							System.out.println("Escreva o valor do prato:");
							float precoPrato = scan.nextFloat();
							System.out.println("Escreva a disponibilidade do prato:");
							int dispPrato = scan.nextInt();
					
							Cardapio novoPrato = new Cardapio(nomePrato, codPrato, precoPrato, dispPrato);
							listaCardapio.add(novoPrato);
						break;
								
						case 2:
							System.out.println("Escreva o nome da bebida:");
							String nomeBebida = scan.next();
							System.out.println("Escreva o codigo do item:");
							int codBebida = scan.nextInt();
							System.out.println("Escreva o valor da Bebida:");
							float precoBebida = scan.nextFloat();
							System.out.println("Escreva a disponibilidade da Bebida:");
							int dispBebida = scan.nextInt();
							CardapioBebidas novaBeb = new CardapioBebidas(nomeBebida, codBebida, precoBebida, dispBebida);
							listaCardapioBebidas.add(novaBeb);
						break;
					
						case 3: 
						System.out.println("Escreva o código do item que deseja remover:");
						int codRemover = scan.nextInt();
						boolean encontrado = false;
							for (int i = 0; i < listaCardapio.size(); i++) {
								if (listaCardapio.get(i).getcodPrato() == codRemover) {
									listaCardapio.remove(i);
									encontrado = true;
									System.out.println("Item removido com sucesso!");
									}
							}
								if (!encontrado) {
									for (int i = 0; i < listaCardapioBebidas.size(); i++) {
										if (listaCardapioBebidas.get(i).getcodBebida() == codRemover) {
											listaCardapioBebidas.remove(i);
											encontrado = true;
											System.out.println("Item removido com sucesso!");
											}
										}
									}
						break;
						
						case 4:
							System.out.println("Escreva o código do item que deseja atualizar:");
							int codAtualizar = scan.nextInt();
							encontrado = false;
							for (Cardapio prato : listaCardapio) {
								if (prato.getcodPrato() == codAtualizar) {
									System.out.println("Digite a nova disponibilidade:");
									int novaDisp = scan.nextInt();
									prato.setdispPrato(novaDisp);
									encontrado = true;
									System.out.println("Disponibilidade atualizada com sucesso!");
								}
							}
							if (!encontrado) {
								for (CardapioBebidas bebida : listaCardapioBebidas) {
									if (bebida.getcodBebida() == codAtualizar) {
										System.out.println("Digite a nova disponibilidade:");
										int novaDisp = scan.nextInt();
										bebida.setdispBebida(novaDisp);
										encontrado = true;
										System.out.println("Disponibilidade atualizada com sucesso!\n");
					
											}
										}
									}
							if (!encontrado) {
								System.out.println("Item não encontrado!");
							}
						break;
					}
					
								System.out.println(" LISTA CARDAPIO ");
								for (Cardapio prato : listaCardapio) {
									System.out.println(" " + prato.prato());
					
								}
					
								for (CardapioBebidas bebida : listaCardapioBebidas) {
									System.out.println(" " + bebida.bebida());
								}
								break;
				
				case 4:
						System.out.println("[1] Cadastrar pedido\n"
							 + "[2] Ver total de bebidas\n"
							 + "[3] Ver total de comida\n");
						Integer opcaoPedido = scan.nextInt();
						switch(opcaoPedido) {
							case 1:
								System.out.print("Informe o número da mesa:");
								int numeroMesa = scan.nextInt();
								System.out.print("Informe seu ID de garçom:");
								int idGarcom = scan.nextInt();
								System.out.println("Informe o número do prato:");
								int codigoItem = scan.nextInt();
								System.out.println("Informe a quantidade do prato:");
								int quantidadeItems = scan.nextInt();
								System.out.println("[0] para Bebida \n[1] para Comida");
								int tipoPedido = scan.nextInt();
								switch (tipoPedido) {
								case 0:
									novoPedido = CadastraPedidoBebida(listaPedidos,numeroMesa, idGarcom, codigoItem,quantidadeItems);
									listaPedidos.add(novoPedido);
									System.out.println("Pedido enviado!");
									System.out.println("Número do pedido:" + novoPedido.getIdPedido());
									break;
								case 1:
									novoPedido = CadastraPedido(listaPedidos,numeroMesa, idGarcom, codigoItem,quantidadeItems);
									listaPedidos.add(novoPedido);
									System.out.println("Pedido enviado!");
									System.out.println("Número do pedido:" + novoPedido.getIdPedido());
									break;
								}
							case 2:
								System.out.println("Qual o número do pedido:");
								Integer numPedidoBebida = scan.nextInt();
								System.out.println("Total "+ TotalPedidoBebida(listaPedidos, listaCardapioBebidas, numPedidoBebida)); 
								break;
							case 3:
								System.out.println("Qual o número do pedido:");
								Integer numPedido = scan.nextInt();
								System.out.println("Total "+ TotalPedidoComida(listaPedidos, listaCardapio, opcaoPedido));
								break;
							}
						break;
				case 5:
					System.out.println("[1] Vendas por garçom\n"
							 + "[2] Vendas do dia\n"
							 + "[3] Valores comissionados\n"
							 + "----------------------------\n");
					Integer opcaoPessoas = scan.nextInt();
					switch(opcaoPessoas) {
						case 1:
								// vendas por funcionario
								System.out.println("Informe o ID do funcionário");
								Integer idGarcom = scan.nextInt();
								Float totalVendas = TotalVendasGarcomPorId(listaPedidos, listaCardapioBebidas, listaCardapio,idGarcom);
								System.out.println("Total de vendas pelo funcionário informado é de: " + totalVendas);
								break;
						case 2:
							// faturamento total
							System.out.println("Total de vendas no dia: " + TotalVendas(listaPedidos, listaCardapioBebidas, listaCardapio));
							break;
						case 3:
							// pagamento comissão
							totalVendasComissionadas(listaPedidos, listaCardapioBebidas, listaCardapio,listaFuncionarios);
							break;
						default:
							System.out.println("Total de vendas no dia: " + TotalVendas(listaPedidos, listaCardapioBebidas, listaCardapio));
							break;

					}
					break;
				case 6:
					System.out.println("Você escolheu sair :)");
					flagLoop = false;
					break;
				default:
					System.out.println("Ops, esta opção não existe!");
					break;
			}
			
		}
	}
	// Gestão funcionários
		public static Funcionario CadastraCarcom(String nome, Integer id) {
			return new Funcionario (nome,id,1);
		}
		public static Funcionario CadastraCozinheiro(String nome, Integer id) {
			return new Funcionario (nome,id,2);
		}
		public static Funcionario CadastraGerente(String nome, Integer id) {
			return new Funcionario (nome,id,3);
		}
		
		// Gerenciamento cardápio
		
		// Cadastro mesas
		public static Mesa CadastraMesa(ArrayList listaMesas, String numeromesa, String capacidadepessoa, Integer disponibilidade) {
			return new Mesa(numeromesa, capacidadepessoa, disponibilidade);
		}
		
		// Pedidos
		public static Pedido CadastraPedidoBebida(List listaPedidos,Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato,Integer qtdItens) {
			// Implementar redução de estoque
			Integer idPedido = listaPedidos.size() + 1;
			return new Pedido(idPedido,numeroMesa, idGarcom, cardapioCodPrato,1, qtdItens);
		}
		public static Pedido CadastraPedido(List listaPedidos,Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer qtdItens) {
			// Implementar redução de estoque
			Integer idPedido = listaPedidos.size() + 1;
			return new Pedido(idPedido,numeroMesa, idGarcom, 0,cardapioCodPrato, qtdItens);
		}
		public static float TotalPedidoComida(List<Pedido> listaPedido,List<Cardapio> listaCardapio, Integer idPedido) {
			Pedido pedido = listaPedido.get(idPedido-1);
			Float vlrComida = listaCardapio.get(pedido.getCardapioCodItem()-1).getprecoPrato();
			Float totalPedido = pedido.getQuantidadeItem() * vlrComida;
			return totalPedido;
		}
		public static float TotalPedidoBebida(List<Pedido> listaPedido,ArrayList<CardapioBebidas> listaCardapioBebidas, Integer idPedido) {
			Pedido pedido = listaPedido.get(idPedido-1);
			Float vlrBebida = listaCardapioBebidas.get(pedido.getCardapioCodItem()-1).getprecoBebida();
			Float totalPedido = pedido.getQuantidadeItem() * vlrBebida;
			return totalPedido;
		}
		// Acompanhamento de vendas por funcionário
		public static float TotalVendasGarcomPorId(List<Pedido> listaPedidos,ArrayList<CardapioBebidas> listaCardapioBebidas,List<Cardapio> listaCardapio, Integer idGarcom) {
			float totalPedido = 0;
			for (Pedido pedido : listaPedidos) {
				if(pedido.getIdGarcom() == idGarcom) {
					
					if(pedido.getTipoPedido() == 0) {
						totalPedido += TotalPedidoBebida(listaPedidos, listaCardapioBebidas,pedido.getIdPedido());
					} else {
						totalPedido += TotalPedidoComida(listaPedidos, listaCardapio,pedido.getIdPedido());
					}
				}
			}
			return totalPedido;
		}
		public static float TotalVendas(List<Pedido> listaPedidos,ArrayList<CardapioBebidas> listaCardapioBebidas,List<Cardapio> listaCardapio) {
			float total = 0;
			for (Pedido pedido : listaPedidos) {
				if(pedido.getTipoPedido() == 0) {
					total += TotalPedidoBebida(listaPedidos, listaCardapioBebidas,pedido.getIdPedido());
				} else {
					total += TotalPedidoComida(listaPedidos, listaCardapio,pedido.getIdPedido());
				}
			}
			return total;
		}
		
		public static void totalVendasComissionadas(List<Pedido> listaPedidos,ArrayList<CardapioBebidas> listaCardapioBebidas,List<Cardapio> listaCardapio,List<Funcionario> listaFuncionarios) {
			float totalVendas = 0;
			Integer totalPedidos = 0;
			for (Funcionario funcionario : listaFuncionarios) {
				for (Pedido pedido : listaPedidos) {
					if(pedido.getIdGarcom() == funcionario.getId()) {
						totalPedidos ++;
						totalVendas += TotalVendasGarcomPorId(listaPedidos, listaCardapioBebidas,listaCardapio,funcionario.getId());
					}				
				}
				System.out.println("Total de comissão da pessoa " + funcionario.getNome() + " foi de " + (totalVendas*totalPedidos) / 100);
				totalVendas = 0;
			}
		}
}