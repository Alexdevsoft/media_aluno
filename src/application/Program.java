package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Stundy;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Stundy estudante = new Stundy();
		
		estudante.aluno = sc.nextLine();
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE %.2f%n POINTS%n", estudante.missinPoints());
		
		if(estudante.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", estudante.missinPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
