import java.text.DecimalFormat;

public class RetailItem {
	private String Des;
	private int OnHand;
	private double Price;
	private double total;
	
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("#,###.00");
		return "RetailItem Des=" + this.Des + ", OnHand=" + this.OnHand + ", Price="
				+ this.Price + ", Subtotal=" + fmt.format(this.getTotal());
	}
	
	public RetailItem(String Des, int OnHand, double Price) {
		this.Des = Des;
		this.OnHand = OnHand;
		this.Price = Price;		
	}
	
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}

	public RetailItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOnHand() {
		return OnHand;
	}
	public void setOnHand(int onHand) {
		OnHand = onHand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getTotal() {
		total = OnHand * Price;
		return total;
	}
}
