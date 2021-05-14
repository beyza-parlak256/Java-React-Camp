package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(); // referans oluþturma
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setDetail("16 Gb Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(15000);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
	}
}










