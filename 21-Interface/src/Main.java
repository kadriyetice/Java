
public class Main {

	public static void main(String[] args) {
		//DeskPhone mikePhone=new DeskPhone(202020202,true);
		ITelephone mikePhone=new DeskPhone(202020202,true);
		mikePhone.powerOn();
		mikePhone.callPhone(202020202);
		mikePhone.answer();

	}

}