package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivoFileWriterBufferedWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_ler_escrever_arquivos\\arquivoEscrito.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
