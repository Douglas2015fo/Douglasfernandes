package questao1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args ) {
		
		Scanner ler = new Scanner(System.in); 
		
		int num = 0;
		int neg = 0;
		
		for(int i = 0; i != 1; i = i) {
			num = ler.nextInt();
			if(num < 0) {
				neg++;
			} else if(num == 0){
				i = 1;
			}
		}
		
		System.out.println( "Quantidade de Numeros Negativos: " + neg );
	}

}
