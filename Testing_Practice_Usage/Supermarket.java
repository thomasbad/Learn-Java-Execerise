public class Supermarket {
	static String location;
	static int numberItems;
	
	public Supermarket(String aLocation, int bnumberItem) {
		Supermarket.location = aLocation;
		Supermarket.numberItems = bnumberItem;
	}
	
	public void checkItem() {
		System.out.println("Location: " + location + ", Number of Items: " + numberItems);
		if(numberItems <= 100) {
			System.out.println("We need to buy more items");
		}
	}

}
