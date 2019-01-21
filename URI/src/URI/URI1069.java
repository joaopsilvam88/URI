package URI;
import java.util.Scanner;

public class URI1069 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array;
		int cont;
		int vari2;
		int quant = Integer.parseInt(scan.nextLine());
		for(int k = 0; k < quant; k++) {
			cont = 0;
			array = scan.nextLine().split("");
			vari2 = (array.length-1);
			for(int i = (array.length-1); i >= 0; i--) {
				if(array[i].equals("<")) {
					vari2 = i;
					for(int j = vari2; j < (array.length); j++) {
						if(array[j].equals(">")) {
							array[i] = array[j] = "";
							cont++;
							break;
						}
					}
				}
			}
			System.out.println(cont);
		}
		scan.close();
	}
}
