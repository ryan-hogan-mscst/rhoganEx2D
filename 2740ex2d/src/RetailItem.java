
public class RetailItem {
	private String Description;
	private int OnHand;
	private double Price;
	
	@Override
	public String toString() {
		return this.Description + ", OnHand=" + this.OnHand
				+ ", Price=" + this.Price;
	}

	public RetailItem(String Description, int OnHand, double Price) {
		super();
		// TODO Auto-generated constructor stub
		this.Description = Description;
		this.OnHand = OnHand;
		this.Price = Price;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getOnHand() {
		return this.OnHand;
	}

	public void setOnHand(int onHand) {
		OnHand = onHand;
	}

	public double getPrice() {
		return this.Price;
	}

	public void setPrice(double price) {
		Price = price;
	}







	

}
