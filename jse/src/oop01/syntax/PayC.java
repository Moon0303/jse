package oop01.syntax;

import java.util.Scanner;



public class PayC {

	
	String name;
	public int salary; 	//급여;
	public static final double TAX = 0.1 ;		//세금 0.1
	public int income;		//실급여 = 급여 - 급여 * 세율
	public int tax1 ;
	
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		System.out.print(" 이름 입력하세요  : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		this.name = name;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
		System.out.print(" 급여를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		salary = scanner.nextInt();
		this.salary = salary;
	}
	
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income - (int)(income * TAX);
	}
	public int getTax1() {
		return tax1;
	}
	public void setTax1(int tax1) {
		this.tax1 = (int)(tax1 * TAX);
	}
	
	

}
