package questao3;

import java.util.Scanner;

public class exercicio3 {
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite ");
		
		num = ler.nextInt();
		
		
		  if ((num + 1) % 5 == 0) {

	            System.out.println(num + 1);

	        }else if ((num + 2)% 5 == 0) {

	           System.out.println(num + 2);

	        }else
		System.out.println(num);
	}
}


