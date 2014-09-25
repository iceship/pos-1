package ar.com.terminal.db.dto;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;

import ar.com.terminal.db.Database;

public class StockTest {

	@Test
	public void returnAmountOfProductCorrecltyWhenAddingOneByOne(){
		
		Database database = mock(Database.class);
		ar.com.pos.Catalog stock = new ar.com.pos.Catalog(database);
		Product product = new Product("1",0.0F, "product1");
		stock.addProduct(product);
		stock.addProduct(product);
		stock.addProduct(product);
		
		Integer amount = stock.getStock(product.getId());
		
		//when(database.);
		
		Assert.assertEquals(amount, new Integer(3));
		
	}
	
	@Test
	public void returnAmountOfProductCorrectlyWhenAddingAll(){
		
		Database database = mock(Database.class);
		ar.com.pos.Catalog catalog = new ar.com.pos.Catalog(database);
		Product product = new Product("1",0.0F, "product1");
		catalog.addProduct(product, 3);
		Integer amount = catalog.getStock(product.getId());
		
		Assert.assertEquals(amount, new Integer(3));
	}
	
	@Test
	public void returnAmountOfProductCorrectlyWhenAddingThemMultipleTimes(){
		
		Database database = mock(Database.class);
		ar.com.pos.Catalog catalog = new ar.com.pos.Catalog(database);
		Product product = new Product("1",0.0F, "product1");
		catalog.addProduct(product, 3);
		
		catalog.addProduct(product);
		
		Integer amount = catalog.getStock(product.getId());
		
		Assert.assertEquals(amount, new Integer(4));
	}
	
}