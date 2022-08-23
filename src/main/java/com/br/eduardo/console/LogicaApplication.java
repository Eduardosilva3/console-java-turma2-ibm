package com.br.eduardo.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	
	
	public static void main(String[] args) throws IOException {
			BufferedReader scanner = new BufferedReader(
            new InputStreamReader(System.in));

			int menuEscolha = 0;
		
		
		
		var menu = new funcoes();
		
		
		
		
		System.out.println("===== Seja Bem Vindo ao sistema de cadastramento de notas. ====");
		System.out.println("");
		
		do {
			System.out.println("Selecione a Opção desejada: ");
			System.out.println("1 - Cadastrar Aluno.");
			System.out.println("2 - Exibir lista de Aluno.");
			
			
			System.out.println("Para sair Digite a senha: 9999.");
			menuEscolha = Integer.parseInt(scanner.readLine());
			
			if(menuEscolha != 9999) {
				funcoes.menuNavegacao(menuEscolha);
				System.out.println("");
			}
			
		}while(menuEscolha != 9999);
		
		System.out.println("Finalizando Sistema ...");
		System.out.println("Sistema Finalizado com Sucesso!");
			
			
	}
}



	
