package loja;

public class Product {
	
	
	private String name;// Variaveis
	private double price;
	

	public Product(String name, double price) {// construtor
		this.name = name;
		this.price = price;
	}

	public String getName() { // get
		return name;
	}
	public void setName(String name) { // set
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String priceTag() {// String de exibição na tela
		return name 
				+ " $ " 
				+ String.format("%.2f", price);
	}
}
