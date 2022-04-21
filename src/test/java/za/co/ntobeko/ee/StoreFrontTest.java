package za.co.ntobeko.ee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import za.co.ntobeko.ee.StoreFront.Product;

class StoreFrontTest {

//	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void shouldGetShoppingCartTotal() {
		
		//given
		StoreFront storeFront = new StoreFront();
		Product doveSoap = new StoreFront().new Product("DOVE_SOAP", StoreFront.doveSoap);
		
		//when
		storeFront.addItem(doveSoap, 5);
		
		//then
		// 5 items
		assertEquals(5, storeFront.getShoppingCart().getItems().size());
		//total of 199.95
		assertEquals(new BigDecimal(199.95).setScale(2, RoundingMode.HALF_UP), storeFront.getShoppingCart().getTotal());
	}
	
	@Test
	public void shouldAddItemsToExistingCartGetShoppingCartTotal() {
		
		//given
		StoreFront storeFront = new StoreFront();
		Product doveSoap = new StoreFront().new Product("DOVE_SOAP", StoreFront.doveSoap);
		storeFront.addItem(doveSoap, 5);
		
		//when
		storeFront.addItem(doveSoap, 3);
		
		//then
		// 8 items
		assertEquals(8, storeFront.getShoppingCart().getItems().size());
		//total of 19.92
		assertEquals(new BigDecimal(319.92).setScale(2, RoundingMode.HALF_UP), storeFront.getShoppingCart().getTotal());
	}
	
	@Test
	public void shouldGetShoppingCartTotalAndTax() {
		
		//given
		StoreFront storeFront = new StoreFront();
		Product doveSoap = new StoreFront().new Product("DOVE_SOAP", StoreFront.doveSoap);
		Product axeDeo = new StoreFront().new Product("AXE_DEO", StoreFront.axeDeo);
				
		//when
		storeFront.addItem(doveSoap, 2);
		storeFront.addItem(axeDeo, 2);
		
		//then
		// 2 dove
		assertEquals(2 , storeFront.getShoppingCart().getProductsByType("DOVE_SOAP").size());
		
		//2 axe
		assertEquals(2 , storeFront.getShoppingCart().getProductsByType("AXE_DEO").size());
		
		// tax 35.00
		assertEquals(new BigDecimal(35.00).setScale(2, RoundingMode.HALF_UP), storeFront.calculateSalesTax());
		
		// total  314.96
		assertEquals(new BigDecimal(314.96).setScale(2, RoundingMode.HALF_UP), storeFront.getTotalWithTax());
	}
}
