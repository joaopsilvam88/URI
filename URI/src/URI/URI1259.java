package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1259 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quant = Integer.parseInt(scan.nextLine());
		int vari;
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		for(int k = 0; k < quant; k++) {
			vari = Integer.parseInt(scan.nextLine());
			if(vari % 2 == 0) {
				pares.add(vari);
			}
			else {
				impares.add(vari);
			}
		}
		pares.sort(null);
		impares.sort(null);
		for(Object i: pares) {
			System.out.println(i);
		}
		for(int k = impares.size()-1; k >= 0; k--) {
			System.out.println(impares.get(k));
		}
		scan.close();
	}
}
