package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1244 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] vari;
		String soma = "";
		int quant = Integer.parseInt(scan.nextLine());
		List<String> lista = new ArrayList<String>();
		lista.add("");
		lista.add("");
		for(int k = 0; k < quant; k++) {
			soma = "";
			vari = scan.nextLine().split(" ");
			for(String s: vari) {
				for(int i = 0; i < lista.size(); i++) {
					if(s.length() > lista.get(i).length()){
						lista.add(i, s);
						break;
					}
				}
			}
			for(String j: lista) {
				soma += " "+j;
			}
			soma = soma.substring(1, soma.length()-2);
			System.out.println(soma);
			lista.clear();
			lista.add("");
			lista.add("");
		}
		scan.close();
	}
}
