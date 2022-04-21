package za.co.ntobeko.ee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StoreFront {

//	private static final MathContext MATH_CONTEXT = new MathContext(2, RoundingMode.HALF_UP);
	public static final BigDecimal doveSoap = new BigDecimal(39.99);
	public static final BigDecimal axeDeo = new BigDecimal(99.99);
	public static final BigDecimal taxRate = new BigDecimal(0.125);

	private ShoppingCart shoppingCart;

	protected class Product {
		private BigDecimal price;
		private String name;

		public Product(String name, BigDecimal price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}
	}

	protected class ShoppingCart {

		private ArrayList<Product> items = new ArrayList<Product>();

		public ArrayList<Product> getItems() {
			return items;
		}

		public BigDecimal getTotal() {

			BigDecimal total = new BigDecimal(0);
			for (Product item : items) {
				total = total.add(item.getPrice());
			}
			return total.setScale(2, RoundingMode.HALF_UP);
		}

		public ArrayList<Product> getProductsByType(String name) {

			ArrayList<Product> itemsForName = new ArrayList<Product>();

			for (Product product : items) {
				if (product.getName().equals(name)) {
					itemsForName.add(product);
				}
			}
			return itemsForName;
		}
	}

	public BigDecimal calculateSalesTax() {

		BigDecimal salesTax = new BigDecimal(0);
		salesTax = shoppingCart.getTotal().multiply(taxRate);
		return salesTax.setScale(2, RoundingMode.HALF_UP);

	}

	public BigDecimal getTotalWithTax() {

		BigDecimal totalWithTax = new BigDecimal(0);
		totalWithTax = totalWithTax.add(shoppingCart.getTotal());
		totalWithTax = totalWithTax.add(calculateSalesTax());
		return totalWithTax.setScale(2, RoundingMode.HALF_UP);

	}

	public StoreFront() {
		this.shoppingCart = new ShoppingCart();
	}

	public void addItem(Product product, int quantity) {

		for (int i = 0; i < quantity; i++) {
			shoppingCart.getItems().add(product);
		}

	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
}
