package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTryWithResources {
	
	public static void main(String[] args) {
		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_ler_escrever_arquivos\\arquivoParaLer.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
