
public class Main {

	public static void main(String[] args) {
        // --------------------------------------------------
        // Create RetailItem objects
        // --------------------------------------------------
		RetailItem retailItem1 = new RetailItem("Snickers Bar", 11, 1.11);
		RetailItem retailItem2 = new RetailItem("Twix Bar", 22, 2.22);
		
        // --------------------------------------------------
        // Test RetailItem objects
        // --------------------------------------------------
		System.out.println("Item 1:");
		System.out.println("\t" + retailItem1.getDescription());
		System.out.println("\tUnits on hand: " + retailItem1.getUnitsOnHand());
		System.out.println("\tPrice: " + retailItem1.getPrice());
		System.out.println("\tTotal value: " + retailItem1.getTotal());
		System.out.println("\ttoString: " + retailItem1.toString());
		
		System.out.println("Item 2:");
		System.out.println("\t" + retailItem2.getDescription());
		System.out.println("\tUnits on hand: " + retailItem2.getUnitsOnHand());
		System.out.println("\tPrice: " + retailItem2.getPrice());
		System.out.println("\tTotal value: " + retailItem2.getTotal());
		System.out.println("\ttoString: " + retailItem2.toString());
		
	}

}
