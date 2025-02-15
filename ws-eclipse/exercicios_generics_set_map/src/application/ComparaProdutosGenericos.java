package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Produto;
import model.services.CalculoService;

public class ComparaProdutosGenericos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> listaProdutos = new ArrayList<>();

		String path = "C:\\Danielle-Projetos\\ws-eclipse\\exercicios_generics_set_map\\arquivoComparacao.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				listaProdutos.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}

			Produto produto = CalculoService.max(listaProdutos);
			System.out.println("Mais Caro:");
			System.out.println(produto);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
