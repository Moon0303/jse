package oop01.syntax;

public class PayA {
	

	
	String name;
	public int salary; 	//급여;
	public static final double TAX = 0.1 ;		//세금 0.1
	private int income;		//실급여 = 급여 - 급여 * 세율
	private int tax1 ;
	
	
public void setTax (int salary){
 	// System.out.println("PayA에 넘어온 파라미터값 : " +salary);
	this.tax1 = (int)(salary*TAX);
	 
	
}


public void setIncome (int salary) {
	
	this.income =  salary - (int)(salary * TAX);


}

public int getTax(){

   return (int)tax1;
}

public int getIncome(){
	
	return (int)income;
}

}



