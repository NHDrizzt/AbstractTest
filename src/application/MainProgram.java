package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class MainProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int payers = sc.nextInt();
		for (int i = 1; i <= payers; i++) {

			System.out.println("Tax payer # " + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(c == 'c') {
				System.out.print("Number of employees: ");
				int num = sc.nextInt();
				list.add(new PessoaJuridica(name, income, num));
			}
			else {
				System.out.print("Health expenditure: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, income, health));
			}
			
		}
		double taxsum =0;
		System.out.println("TAXES PAID");
		for(Pessoa x : list) {
			taxsum += x.tax();
			System.out.println(x);
		}
		System.out.println("TOTAL TAXES: " + taxsum);
	}
}
