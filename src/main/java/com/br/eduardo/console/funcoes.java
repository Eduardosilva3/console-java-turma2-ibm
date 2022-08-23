package com.br.eduardo.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class funcoes {
    
    /*private static List<String> nomes = new ArrayList<>();
	private static List<String> situacao = new ArrayList<>();
	private static List<Double> notas = new ArrayList<>();*/
	private static int idAluno;
    
    private static List<aluno> alunos = new ArrayList<>();
    
    
    
    
    public static void menuNavegacao(int escolha) throws NumberFormatException, IOException {
		
		int quantidadeAlunos = 0;
		
		String nomeAluno = "";
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		switch (escolha) {
		case 1:
			System.out.println("Digite a Quantidade de aluno que deseja cadastrar: ");
			
			quantidadeAlunos = lerDadoInt();
			
			for(int i = 1; i <= quantidadeAlunos; i++) {
				System.out.println("Digite o Nome do aluno: ");
				nomeAluno = lerDado();
				System.out.println("Digite a nota 1 de "+nomeAluno+":");
				nota1 = lerDadoDouble();
				System.out.println("Digite a nota 2 de "+nomeAluno+":");
				nota2 = lerDadoDouble();
				System.out.println("Digite a nota 3 de "+nomeAluno+":");
				nota3 = lerDadoDouble();
				
				adicionarAluno(idAluno, nomeAluno, nota1, nota2, nota3);
				
				System.out.println("Aluno Adicionado com Sucesso!");
				
				idAluno++;
				System.out.println("");
			}
			break;
		case 2:
			System.out.println("=== Imprimindo Lista de Alunos. ===");
			imprimirAlunoSituacao();
			break;
		
		
		
		
		
		
		
		default:
			System.out.println("Opção Invalida - Tente novamente.");
			break;
		}
	}
	
	
	
	
	public static String obterSituacaoAluno(double nota1, double nota2, double nota3) {
		String situacao = "";
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media>=7) {
			situacao = "APROVADO";
		}else if(media>=5){
			situacao = "RECUPERAÇÃO";
		}else if(media<5 && media >=0) {
			situacao = "REPROVADO";
		}
		
		
		return situacao;


			
			
			
	}
	
	public static void adicionarAluno(int idAluno, String nome, double nota1, double nota2, double nota3) {
		
		double media = (nota1 + nota2 + nota3) / 3;
		String situacao = obterSituacaoAluno(nota1, nota2, nota3);
		
        alunos.add(idAluno, new aluno(nome, media, situacao));
		
	}
	
	public static void imprimirAlunoSituacao() {
		for(int i = 0; i <=alunos.size()-1;i++) {
			System.out.println("Nome: "+alunos.get(i).getNome()+": "+alunos.get(i).getSituacao());
		}
	}
	
	
	
	
	public static String lerDado() throws IOException {
		BufferedReader scanner = new BufferedReader(
            new InputStreamReader(System.in));
		String texto = scanner.readLine();
		
		return texto;
	}
	
	public static Integer lerDadoInt() throws NumberFormatException, IOException {
		BufferedReader scanner = new BufferedReader(
        new InputStreamReader(System.in));
		int inteiro = Integer.parseInt(scanner.readLine());
		
		return inteiro;
	}
	
	public  static Double lerDadoDouble() throws NumberFormatException, IOException {
		BufferedReader scanner = new BufferedReader(
        new InputStreamReader(System.in));
		String nota = "";
		nota = scanner.readLine();
		
		if(nota.contains(",")) {
			String[] notaCorrigido = nota.split(",");
			nota = notaCorrigido[0] + "." + notaCorrigido[1];
		}
		
		double valor = Double.parseDouble(nota);
		
		while(valor>10||valor<0) {
			System.out.println("Valor Invalido, Digite a nota Novamente: ");
			valor = Double.parseDouble(scanner.readLine());
		}
		
		
		
		return valor;
	}

}
