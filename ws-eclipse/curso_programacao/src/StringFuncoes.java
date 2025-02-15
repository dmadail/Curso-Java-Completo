
public class StringFuncoes {

	public static void main(String[] args) {
		String teste = " Danielle Da Rosa Gonzatto Madail ";
		
//		Formatar: toLowerCase(), toUpperCase(), trim()
		System.out.println("Original    : " + teste);
		
		System.out.println("Lower Case  : " + teste.toLowerCase());
		
		System.out.println("Upper Case  : " + teste.toUpperCase());
		
		System.out.println("Trim        : " + teste.trim());
		
		
//		Recortar: substring(inicio), substring(inicio, fim)
		System.out.println("Substring(2): " + teste.substring(2));
		System.out.println("Substring(2): " + teste.substring(27,34));
		
//		Substituir: Replace(char, char), Replace(string, string)
		System.out.println("Replace     : " + teste.replace("Rosa", "Flor"));
		System.out.println("Replace (c) : " + teste.replace("a", "4"));
		
//		Buscar: IndexOf, LastIndexOf
		System.out.println("IndexOF     : " + teste.indexOf("el"));
		System.out.println("LastOF      : " + teste.lastIndexOf("da"));

		
//		Recortar com Base em uma string: str.Split(" ")
		String[] vect = teste.split(" " );

		System.out.println("Vetor 1 : " + vect[0]);
		System.out.println("Vetor 2 : " + vect[1]);
		System.out.println("Vetor 3 : " + vect[2]);
		System.out.println("Vetor 4 : " + vect[3]);
		System.out.println("Vetor 5 : " + vect[4]);
		System.out.println("Vetor 6 : " + vect[5]);
		
		

	}

}
