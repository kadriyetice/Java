
public class Task {

	public static void main(String[] args) {
		System.out.println(sumDigit(125));
		System.out.println(sumDigit(-125));
		System.out.println(sumDigit(32125));
	}
	
	public static int sumDigit(int number) {
		if(number<10) {
			return -1;
		}
		
		int sum=0;
		while(number>0) {
			int digit=number%10;  // 5,2,1
			sum=sum+digit;        //==>8
			number=number/10;     // 12,1
		}
		return sum;
		
		
	}

}

//public class Task {    //Reverse integer
//
//	public static void main(String[] args) {
//		System.out.println(reverseInt(125));
//		System.out.println(reverseInt(-125));
//		System.out.println(reverseInt(32125));
//	}
//	
//	public static int reverseInt(int number) {
//		if(number<10) {
//			return -1;
//		}
//		
//		int reverse=0;
//		while(number>0) {
//			int digit=number%10; 
//			reverse=reverse*10;              
//			reverse=reverse+digit;       
//			number=number/10;     
//		}
//		return reverse;
//		
//		
//	}
//
//}



