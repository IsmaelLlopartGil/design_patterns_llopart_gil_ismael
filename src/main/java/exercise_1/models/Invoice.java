package exercise_1.models;

import java.util.*;

public class Invoice {

	private String name;
	private double amount;
	private Map<Item, Integer> itemMap;

	public Invoice(String name) {
		this.name = name;
		amount = 0;
		itemMap = new HashMap<>();
	}

	private void calculateAmount() {
		amount = 0;

		for (Item item : itemMap.keySet()) {
			amount += (item.getSalePrice() * itemMap.get(item));
		}
	}

	public boolean ifContainsKey(Item item) {
		return itemMap.containsKey(item);
	}

	public void addItemToMap(Item item, int quantity) {
		itemMap.put(item, quantity);
		calculateAmount();
	}

	@Override
	public String toString() {
		return "Número de factura: " + name + ", Import total: " + amount + ", Producte/Quantitat: " + itemMap;
	}

	public Double getAmount() {
		return amount;
	}

}
