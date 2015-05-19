package oop01.syntax;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class PayD {
 public static void main(String[] args) {
		
		
	 
	 
	for(int i = 0 ; i < 3 ; i++){	
		String hulk = "";
		int hulkSalary = 0;
		
/*		String iron = "아이언";
		int ironSalary = 0;
		
		String thor = "토르";
		int thorSalary = 0;*/
		
		PayC hulkPay = new PayC();
		hulkPay.setName(hulk);
		hulkPay.setSalary(hulkSalary);
		hulkPay.setTax1(hulkPay.getSalary());
		hulkPay.setIncome(hulkPay.getSalary());
		System.out.println("=== " +hulkPay.getName() + "의 5월 급여 내역 ===");
		System.out.println("급여   : " + hulkPay.getSalary());
		System.out.println("세금   : " +hulkPay.getTax1());
		System.out.println("실급여 : " +hulkPay.getIncome());
		System.out.println();
	}
		
		
/*		PayC ironPay = new PayC();
		ironPay.setName(iron);
		ironPay.setSalary(ironSalary);
		ironPay.setTax1(ironPay.getSalary());
		ironPay.setIncome(ironPay.getSalary());
		System.out.println("=== " +ironPay.getName() + "의 5월 급여 내역 ===");
		System.out.println("급여   : " + ironPay.getSalary());
		System.out.println("세금   : " +ironPay.getTax1());
		System.out.println("실급여 : " +ironPay.getIncome());
		System.out.println();
		
		PayC thorPay = new PayC();
		thorPay.setName(thor);
		thorPay.setSalary(thorSalary);
		thorPay.setTax1(thorPay.getSalary());
		thorPay.setIncome(thorPay.getSalary());
		System.out.println("=== " +thorPay.getName() + "의 5월 급여 내역 ===");
		System.out.println("급여   : " + thorPay.getSalary());
		System.out.println("세금   : " +thorPay.getTax1());
		System.out.println("실급여 : " +thorPay.getIncome());
		System.out.println();*/
}
}
