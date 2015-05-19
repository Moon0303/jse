package oop01.syntax;

import java.util.Scanner;

public class PayB {
	public static void main(String[] args) {
		
		
	
		
		String hulk = "헐크";
		System.out.print( hulk +"의 급여를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int hulkSalary = scanner.nextInt();
		
		
		
		String iron = "아이언";
		System.out.print(iron +"의 급여를 입력하세요 : ");
		Scanner iron1 = new Scanner(System.in);
		int ironSalary = iron1.nextInt();
		
		String thor = "토르";
		System.out.println(thor + "의 급여를 입력하세요 : ");
		Scanner thor1 = new Scanner(System.in);
		int thorSalary = thor1.nextInt();
		
		PayA hulkPay = new PayA();
		hulkPay.setTax(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		System.out.println("=== " + hulk + "의 5월 급여 내역 ===");
		System.out.println("급여   : " + hulkSalary);
		System.out.println("세금   : " +hulkPay.getTax());
		System.out.println("실급여 : " +hulkPay.getIncome());
		System.out.println();
		
		
		PayA ironPay = new PayA();
		ironPay.setTax(ironSalary);
		ironPay.setIncome(ironSalary);
		
		System.out.println("===" +iron+"의 5월 급여 내역 ===");
		System.out.println("급여   : " + ironSalary);
		System.out.println("세금   : " + ironPay.getTax());
		System.out.println("실급여 : " + ironPay.getIncome());
		System.out.println();
		
		
		PayA thorPay = new PayA();
		thorPay.setTax(thorSalary);
		thorPay.setIncome(thorSalary);
		System.out.println("=== "+thor+"의 5월 급여 내역 ===");
		System.out.println("급여   : " + thorSalary);
		System.out.println("세금   : " + thorPay.getTax());
		System.out.println("실급여 : " + thorPay.getIncome());
		System.out.println();
		
	}
}
