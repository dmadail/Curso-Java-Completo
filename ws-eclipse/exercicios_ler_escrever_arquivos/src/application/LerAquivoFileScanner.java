package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerAquivoFileScanner {

	public static void main(String[] args) {
		
		File file = new File("C:\\Danielle-Projetos\\ws-eclipse\\exercicios_ler_escrever_arquivos\\arquivoParaLer.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
