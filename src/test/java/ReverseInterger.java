
public class ReverseInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23456;
		int reverse =0;
		
		while (num !=0) {
			
			int reminder = num % 10;
			reverse = reverse *10 + reminder;
			num = num /10;
		}

	}

}
