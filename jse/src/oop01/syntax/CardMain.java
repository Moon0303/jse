package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		
		
		
		
		System.out.print("내");
		CardVo myCard = new CardVo(3,"heart");
		

		
		
		System.out.print("당신");
		CardVo yourCard = new CardVo(7,"herat");
		
		
		
		System.out.println("카드의 높이 : "+ CardVo.width );
		System.out.println("카드의 너비 : "+ CardVo.height );
		

		
		/*		myCard.kind = "Heart";
				myCard.number = 3;*/
		
		
		
/*		yourCard 인스턴스를 생성하고
		무늬는 heart이고 숫자는 7이 나왔다고 가정할때
	    게임룰은 높은숫자 카드가 승리하는 게임입니다 */
		
		
/*		System.out.println("당신 카드의" +숫자+"는 " +7+ "이고 " 
							+"내카드의 " +숫자+ "는" +3 +"이므로"
							+"당신이 이겻습니다.");
		*/
		
	}
	
}
