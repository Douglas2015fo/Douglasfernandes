package questao2;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int rps1, rps2;
		int aux1 = 0;
		int aux2 = 0;
		int sul, sud, ce, No, nor;
		int cont =0;
		sul=0;
		sud=0;
		ce=0;
		No=0;
		nor=0;
		
		for(cont =0; cont<=100; cont++) {
			
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1 – Sim");
			System.out.println("2 - Não");
			
			rps1 = ler.nextInt();
			if(rps1 == 1) {
				aux1 ++;
			}
			if(rps1 == 2) {
				aux2 ++; 
			}
			
			System.out.println("Em que região voce mora ?\n");
			System.out.println("1 - Sul ");
			System.out.println("2 – Sudeste ");
			System.out.println("3 – Centro-Oeste ");
			System.out.println("4 – Norte ");
			System.out.println("5 – Nordeste ");
			
			rps2 = ler.nextInt();
			if(rps2 == 1) {
				sul++;
			}
			if(rps2 == 2) {
				sud++;
			}
			if(rps2 == 3) {
				ce++;
			}
			if(rps2 == 4) {
				No++;
			}
			if(rps2 == 5) {
				nor++;
			}
		}
		
		System.out.println(aux1 + " Votaram Sim\n");
		System.out.println(aux2 +" Votaram Não\n\n");
	
		System.out.println(sul + " Mora no sul ");
		System.out.println(sud + " Mora no sudeste");
		System.out.println(ce + " Mora no centro oeste");
		System.out.println(No + " Mora no norte");
		System.out.println(nor + " Mora no Nordeste");
		
	}

		
	}


