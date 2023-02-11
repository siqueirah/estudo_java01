package principal;

import java.util.Scanner;

import controllers.PessoaController;

public class Program {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			PessoaController pessoaController = new PessoaController();

			System.out.println("\nPROJETO JAVA - CRUD POSTGRESQL\n");
			System.out.println("(1) - Cadastrar pessoa");
			System.out.println("(2) - Atualizar pessoa");
			System.out.println("(3) - Excluir pessoa");
			System.out.println("(4) - Consultar pessoas");
			
			System.out.print("\nInforma a opção desejada: ");
			Integer opcao = Integer.parseInt(scanner.nextLine());

			switch(opcao) {
				
			case 1: pessoaController.cadastrarPessoa(); break;
			case 2: pessoaController.atualizarPessoa(); break;
			case 3: pessoaController.excluirPessoa(); break;
			case 4: pessoaController.consultarPessoas(); break;
			default:
				
				
				System.out.println("\nOpção inválida!");
				break;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



