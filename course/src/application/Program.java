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
		
		System.out.printf("Média Final: %.2f%n", aluno.finalMedia());
		
		if (aluno.finalMedia() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f points%n", aluno.missingPoint());
		} 
		else {
			System.out.println("Aprovado");
		}
		sc.close();

	}

}
