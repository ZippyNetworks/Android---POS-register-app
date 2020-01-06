package com.refresh.pos.domain.inventory;

import java.util.HashMap;
import java.util.Map;

import com.refresh.pos.domain.DateTimeStrategy;

/**
 * Lot or bunch of product that import to inventory.
 * 
 * @author Refresh Team
 * 
 */
public class ProductLot {
	
	private int id;
	private String dateAdded;
	private int quantity;
	private Product product;
	private double unitCost;
	
	/**
	 * Static value for UNDEFINED ID.
	 */
	public static final int UNDEFINED_ID = -1;

	/**
	 * Constructs a new ProductLot.
	 * @param id ID of the ProductLot, This value should be assigned from database.
	 * @param dateAdded date and time of adding this lot.
	 * @param quantity quantity of product.
	 * @param product a product of this lot.
	 * @param unitCost cost (of buy) of each unit in this lot.
	 */
	public ProductLot(int id, String dateAdded, int quantity, Product product, double unitCost) {
		this.id = id;
		this.dateAdded = dateAdded;
		this.quantity = quantity;
		this.product = product;
		this.unitCost = unitCost;
	}
	
	public String getDateAdded() {
		return dateAdded;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double unitCost() {
		return unitCost;
	}

	public int getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	/**
	 * Returns the description of this ProductLot in Map format. 
	 * @return the description of this ProductLot in Map format.
	 */
	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id + "");
		map.put("dateAdded", DateTimeStrategy.format(dateAdded));
		map.put("quantity", quantity + "");
		map.put("productName", product.getName());
		map.put("cost", unitCost + "");
		return map;
	}
}