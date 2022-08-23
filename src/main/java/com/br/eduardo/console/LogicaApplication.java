package com.br.eduardo.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
			BufferedReader scan = new BufferedReader(
            new InputStreamReader(System.in));
			
			//Solicitando nomes para o usuario
			System.out.println("Digite o nomes separados por espaço:");
			String nome = scan.readLine();
			
			//manipulação de string para separar os nomes
			String[] nomes = nome.split(" ");
        
			//for para imprimir os nomes
			for(String n : nomes){
				int cont = 1;

				System.out.println("Nome Digitado "+cont+" : "+n);
				cont ++;
			}
	}

}
