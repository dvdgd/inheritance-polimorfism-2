package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double yearlyIncome = sc.nextDouble();
			if (x == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpending = sc.nextDouble();
				TaxPayer person = new Individual(name, yearlyIncome, healthSpending);
				list.add(person);
			} else if (x == 'c') {
				System.out.print("Number of emplyees: ");
				int employees = sc.nextInt();
				TaxPayer person = new Company(name, yearlyIncome, employees);
				list.add(person);
			}
		}
		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
			sum += p.tax();
		}
		System.out.printf("\nTOTAL TAXES: %.2f", sum);
				
		sc.close();
	}

}
