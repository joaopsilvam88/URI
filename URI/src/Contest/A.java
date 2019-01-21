package Contest;

import java.util.Scanner;
import java.io.IOException;

public class A {

	
	public static void main(String[] args) throws IOException{
		
		String[] pontos = new String[27];
		String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};		
		pontos[0] = ".";
		pontos[1] = "..";
		pontos[2] = "...";
		int k;
		for(int i = 3; i < 27; i+=3) {
			k = i-3;
			pontos[i] = pontos[k]+" "+pontos[0];
			pontos[i+1] = pontos[k+1]+" "+pontos[1];
			pontos[i+2] = pontos[k+2]+" "+pontos[2];
		}
		
		Scanner scan = new Scanner(System.in);
		int quant = Integer.parseInt(scan.nextLine());
		String ponto;
		for(int i = 0; i <quant; i++) {
			ponto = scan.nextLine();		
			for(int j = 0; j < 26; j++) {
				if(ponto.equals(pontos[j])) {
					System.out.println(letras[j]);
					break;
				}

			}
		}
	}
}
