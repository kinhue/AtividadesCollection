package atividadeCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	boolean sim;

		ArrayList<String> listaCores = new ArrayList<String>(); 
		
		System.out.println("\nDigite 5 cores: ");
		
		listaCores.add(leia.next());
		listaCores.add(leia.next());
		listaCores.add(leia.next());
		listaCores.add(leia.next());
		listaCores.add(leia.next());
				
		System.out.println("As cores foram: "+listaCores);
		
		Collections.sort(listaCores, String.CASE_INSENSITIVE_ORDER);
		 	System.out.println("As cores ordenadas ficaram assim: "+listaCores);
		
		
		
		

	}

}