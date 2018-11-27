
public class CalculateScore {

	public static void main(String[] args) {
		int newScore= calculateScore("mike",500);
		System.out.println("New Score is "+newScore);
		
		calculateScore(75);
		
		calculateScore();
	}
	
	public static int calculateScore(String name,int score) {
		System.out.println("Player "+name+" scored "+score+" points");
		return score*100;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player Scored "+score+" points");
		return score*100;
	}
	
	public static void calculateScore() {
		System.out.println("No player Name, No Player Score");
	}
	
}
