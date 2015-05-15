package cmm04.array;

/*이중배열*/

public class No05_MultiDimArryDemo {
		public static void main(String[] args) {
			String[][] names = {
					{"Mr.","Ms.", "Mrs"} , 
					{"Smith","Johns","Alex"} };
			
			System.out.println(names[0][0] + names [1][0]);  //mr.Smith  
			System.out.println(names[0][1] + names [1][2]);  //ms.Alex
			
			
		}
}
