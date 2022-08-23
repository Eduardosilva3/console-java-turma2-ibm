package com.br.eduardo.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
			BufferedReader scan = new BufferedReader(
            new InputStreamReader(System.in));
			
			System.out.println("Digite o nomes separados por espaço");
			String nome = scan.readLine();
			String[] nomes = nome.split(" ");
        
		

			for(String n : nomes){
				System.out.println(n);
			}
	}

}
