package URI;
import java.io.IOException;
import java.util.Scanner;

public class URI1120 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int vari = 0;
		String vari2 = "";
		String vari3;
		float vari4;
		while(true) {
			vari3 = "";
			for(int k = 0; k < vari2.length(); k++){
				if(!vari2.substring(k, k+1).equals(vari+"")) {
					vari3+=vari2.substring(k, k+1);
				}
			}
			if(vari3 != "") {
				vari4 = Float.parseFloat(vari3);
				System.out.println((""+vari4).substring(0, -2));
			}else {
				if(vari2 != "") {
					System.out.println(0);
				}
			}
			vari = scan.nextInt();
			vari2 = scan.next();
			if(vari == 0) {
				break;
			}
		}
		scan.close();
	}
}
