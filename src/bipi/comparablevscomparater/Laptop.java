package bipi.comparablevscomparater;

public class Laptop implements Comparable<Laptop> {
	private String brandName;
	private int ram;
	private double price;
	
	
	
	
	public Laptop(String brandName, int ram, double price) {
		super();
		this.brandName = brandName;
		this.ram = ram;
		this.price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		
		if(this.price > o.getPrice()) {
			return 1;
		} else
			if(this.price < o.getPrice()) {
				return -1;
			}else {
				return 0;
			}
	}
	
	
	

}
