
public class Pizza {
	private int price;
	private Boolean veg;
	private int cheese=100;
	private int topings=100;
	private int bag=20;
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
			System.out.println("Veg Pizza selected: " + price);
		}
		else {
			this.price=400;
			System.out.println("NonVeg Pizza selected: " + price);
		}
		
	}
	
	public void addcheese() {
		this.price+=cheese;
		System.out.println("Extra cheese added: " + cheese);
		
	}
	
	public void addtopings() {
		this.price+=topings;
		System.out.println("Extra topings added: " + topings);
		
	}
	public void takeaway() {
	
	this.price+=bag;
	System.out.println("Takeaway bag price: " + bag);
	}
	public void getbill() {
		System.out.println();
		System.out.println("The total amount is: " + price);
	
	}



}
