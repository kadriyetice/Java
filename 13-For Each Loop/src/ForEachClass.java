
public class ForEachClass {

	public static void main(String[] args) {
		int[] marks= {125,132,95,116,110};
		int highest_mark=maximum(marks);
		System.out.println(highest_mark);
	}
	
	public static int maximum(int[] array) {
		
		int max=array[0];
		
		//for(int i=0;array.length;i++) {}   // for-iterator Loop
		
		for(int num : array ) {    //For-Each Loop
			if(num>max) {
				max=num;
			}
		}
		return max;
	}

}
