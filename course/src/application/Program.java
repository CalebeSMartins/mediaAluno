package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", aluno.finalMedia());
		
		if (aluno.finalMedia() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points%n", aluno.missingPoint());
		} 
		else {
			System.out.println("Pass");
		}
		sc.close();

	}

}
