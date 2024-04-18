package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		System.out.println("----------------filtering the object using for loop----------------");
		for (Product product : getProducts()) {
			if (product.getPrice() < 50000) {
				list.add(product);
			}
		}
		for (Product product : list) {
			System.out.println(product);
		}
		System.out.println();
		System.out.println("----------------filtering the object using StreamAPI----------------");

		List<Product> list2 = getProducts().stream().filter((product) -> product.getPrice() > 50000)
				.collect(Collectors.toList());
		list2.forEach(System.out::println);

		// we can also do this using forEach() in single line
		System.out.println("---------------------------------------------------------------------");
		getProducts().stream().filter((product) -> product.getName().startsWith("A")).forEach(System.out::println);
	}

	// creating static collection list
	private static List<Product> getProducts() {
		List<Product> productList = new ArrayList<>();

		productList.add(new Product(199, "HP Laptop", 65000));
		productList.add(new Product(201, "Lenovo Laptop", 40000));
		productList.add(new Product(111, "Apple Laptop", 95000));
		productList.add(new Product(251, "Dell Laptop", 75000));
		productList.add(new Product(391, "Asus Laptop", 45000));
		return productList;
	}
}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}