package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoFileReaderBufferedReader {
	
	public static void main(String[] args) {
		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_ler_escrever_arquivos\\arquivoParaLer.txt";
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
