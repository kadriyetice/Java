import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryObject = new GroceryList();

	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryObject.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit=true;
				break;
			}
			
		}
	}
	
	public static void printInstructions() {
		System.out.println("0:Display Again the Options\n1:Print Grocery List\n2:Add items\n3:Modify Items\n4:Remove Items\n5:Search items \n6:Quit");
	}
	
	public static void printGroceryList() {
		groceryObject.printGroceryList();
	}
	
	public static void addItem() {
		System.out.println("What would you like to add");
		String addedItem=scanner.nextLine();
		groceryObject.addGroceryItem(addedItem);
	}
	
	public static void modifyItem() {
		System.out.println("Please write the item that you want to change");
		String modItem=scanner.nextLine();
		System.out.println("Please write the number of the new item");
		int position=scanner.nextInt();
		scanner.nextLine();
		groceryObject.modifyGroceryItem(position,modItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter the number of the item that you want to remove");
		int number=scanner.nextInt();
		groceryObject.removeGroceryItem(number);
	}
	
	public static void searchForItem() {
		System.out.println("Which item would you like to check");
		String searchItem=scanner.nextLine();
		groceryObject.findItem(searchItem);
		
		
	}

}



// Kanat
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner scanner=new Scanner(System.in);
//    private static GroceryList groceryList=new GroceryList();
//
//    public static void main(String[] args) {
//        boolean quit=false;
//        int choice=0;
//        while (!quit){
//            printIntructions();
//            System.out.println("Enter you choice");
//            choice=scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 0:
//                    printIntructions();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    quit=true;
//                    break;
//            }
//        }
//    }
//
//    public static void printIntructions(){
//        System.out.println("0:Print Instructions\n1:Print Grocery list\n2:Add items\n3:Modify Items\n4:Remove Items\n5:Search items \n6:Quit");
//    }
//
//    public static void addItem(){
//        System.out.println("Add ITEM ");
//        String addItem=scanner.nextLine();
//        groceryList.addGroceryItem(addItem);
//    }
//    public static void modifyItem(){
//        System.out.println("Modify please enter number of grocery ");
//        int position=scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Modify please enter new item ");
//        String newItem=scanner.nextLine();
//        groceryList.modifyGroceryItem(position-1,newItem);
//
//    }
//    public static void removeItem(){
//        System.out.println("Please enter number of grocery to remove");
//        int position=scanner.nextInt();
//        groceryList.removeGroceryItem(position-1);
//    }
//    public static void searchForItem(){
//        System.out.println("Please enter item to search");
//        String item=scanner.nextLine();
//        String position=groceryList.findItem(item);
//        System.out.println("Searched item returned value "+position);
//    }
//}
//



//package ArrayList;
//
//import java.util.Scanner;
//
//public class ShoppingMethods {
//
//	private static Scanner answer = new Scanner(System.in);
//	private static GroceryList myList = new GroceryList();
//	
//	public static void printInstructions(){
//		System.out.println("Hello I am your online shopping tool!! Please choose from following options. " 
//				+ "Press: \n0 - to repeat the instructions;\n1 - to print the shopping list"
//				+ "\n2 - to add a new item; \n3 - to modify the list;\n4 - to remove an item;"
//				+ "\n5 - to search for item in the list; \n6 - to quit the program");
//	}
//	
//	public static void printGroceryList(){
//		myList.printGroceryList();
//	}
//	
//	public static void addGroceryItem(){
//		System.out.println("What item would you like to add in your list?");
//		String add = answer.nextLine();
//		myList.addGroceryItem(add);
//	}
//	
//	public static void modifyGroceryItem(){
//		System.out.println("What is the index of the item?");
//		int position = answer.nextInt();
//		answer.nextLine();
//		System.out.println("What is the name if the item?");
//		String newItem =  answer.nextLine();
//		myList.modifyGroceryItem(position, newItem);
//	}
//	
//	public static void removeGroceryItem(){
//		System.out.println("Which item would you like to remove?");
//		String item = answer.nextLine();
//		myList.removeGroceryItem(item);
//	}
//	
//	public static void findItem(){
//		System.out.println("Which item would you like me to find for you?");
//		String searchItem = answer.nextLine();
//		myList.findItem(searchItem);
//	}
//	
//}
