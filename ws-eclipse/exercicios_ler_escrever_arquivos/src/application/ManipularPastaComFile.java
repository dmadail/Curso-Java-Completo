package application;

import java.io.File;
import java.util.Scanner;

public class ManipularPastaComFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da Pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Pastas:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\CriadoPelaAula").mkdir();
		
		System.out.println("Diretório criado com sucesso: " + success);
		sc.close();

	}

}
