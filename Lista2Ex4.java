package atividadeCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista2Ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		List<Integer> numeros = new ArrayList<Integer>();
	
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
			
		System.out.println("\nDigite um número inteiro: ");
		x= leia.nextInt();
		if (numeros.contains(x)) {
			System.out.println("Seu numero está na lista");
		}else {
		 System.out.println("Número não foi encontrado.");
		}
	
		
		
		
		
		
		
	}

}
