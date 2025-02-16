/*Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de votação. Você deve fazer um programa para ler os registros de votação a partir de um
arquivo, e daí gerar um relatório consolidado com os totais de cada candidato.*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemVotos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> candidatos = new HashMap<>();
			
			String linha = br.readLine();
			while (linha != null) {
				
				String[] campos = linha.split(",");
				String nomeCandidato = campos[0];
				int votos = Integer.parseInt(campos[1]);
				
				if (candidatos.containsKey(nomeCandidato)) {
					int votosAteAgora = candidatos.get(nomeCandidato);
					candidatos.put(nomeCandidato,votosAteAgora + votos);
				}
				else {
					candidatos.put(nomeCandidato,votos);
				}
					
				
				linha = br.readLine();
			}
			
			for (String key : candidatos.keySet()) {
				System.out.println(key + ": " + candidatos.get(key));
			}
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
