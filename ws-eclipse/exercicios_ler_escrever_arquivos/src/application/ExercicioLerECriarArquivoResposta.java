/*Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item possui um nome, preço unitário
e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" 
a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado 
pela quantidade),conforme exemplo.*/

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class ExercicioLerECriarArquivoResposta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Entre com o caminho do arquivo excel para ler os produtos: ");
		String strArquivo = sc.nextLine();
		
		File strCaminho = new File(strArquivo);		
		String pastaOrigem = strCaminho.getParent();
		boolean success = new File(pastaOrigem + "\\out").mkdir();
		String arquivoDestino = pastaOrigem + "\\out\\produtosTotalizados.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(strArquivo))) {
			String linha = br.readLine();
			
			while (linha != null) {
				String[] fields = linha.split(",");
				String nome = fields[0];
				double preco = Double.parseDouble(fields[1]);
				int quantidade = Integer.parseInt(fields[2]);
				
				produtos.add(new Produto(nome,preco,quantidade));
				linha = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))){
				
				for(Produto produto : produtos) {
					bw.write(produto.getNome() + "," + String.format("%.2f",produto.subTotal()));
					bw.newLine();
				}
				
				System.out.println(arquivoDestino + " Criado com Sucesso!");
					
			}catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			} 
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			sc.close();
		}
		
		
		
	}

}
