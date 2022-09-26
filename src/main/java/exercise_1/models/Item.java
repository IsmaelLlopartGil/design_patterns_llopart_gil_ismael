package exercise_1.models;

public abstract class Item {

	private float purchasePrice;
	private float salePrice;
	private String name;
	private String descripcion;
	
	public Item(String name) {
		this.name=name;
	}

	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return name;
	}
}
