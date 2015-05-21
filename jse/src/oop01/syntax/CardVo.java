package oop01.syntax;

public class CardVo {
  
  private String kind ;  //카드의 무늬
  private int number;    //카드의 숫자
  static int width = 150; // 카드의 너비
  static int height = 300; // 카드의 높이

 
  
  public  CardVo(){
	  System.out.print("카드의 ");
  }
  
  
  public  CardVo(int num){
	  this();
	  System.out.print(" 숫자는" + num +"이고 ");
  }
  
  
  public  CardVo(int num , String kind){
   	
	  this(num);
	  this.kind = kind;
	  System.out.println("무늬는 " + kind);
	
  }
  
}
