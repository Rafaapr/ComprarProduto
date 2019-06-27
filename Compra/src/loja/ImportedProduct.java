package loja;

public class ImportedProduct extends Product {
	
	private double customsFree;
	
	public ImportedProduct(String name, double price, double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(double customsFree) {
		this.customsFree = customsFree;
	}
	
	public double totalPrice() {
		return getPrice()+customsFree;
	}
	
	@Override
	public String priceTag() { // String sobrescrita para exibir na tela prod importados
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice()) // formatação de preço
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFree)
				+ ")";
		
	}
	

}
