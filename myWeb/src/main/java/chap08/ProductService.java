package chap08;

import java.util.*;

public class ProductService {

	private Map<String, Product> products;
	// key는 String, value는 Product객체
	// Map은 인터페이스타입의 레퍼런스
	
	public ProductService() {
		this.products = new HashMap<String, Product>();
		
		products.put("101", new Product("101", "갤럭시 노트10", "삼성전자", 1200000, "2023.08.20"));
		products.put("102", new Product("102", "아이폰14", "애플", 1600000, "2023.05.10"));
		products.put("103", new Product("103", "V50", "LG전자", 900000, "2023.07.25"));
	}
		
	// 값들만 모아서 collection으로 반환하고 ArrayList에 값들을 넣어줌
	// Collection(인터페이스) -> List(인터페이스)
	// -> ArrayList(인터페이스를 구현할 대표적인 클래스)
	// 그냥 빈 ArrayList<Product>()를 만들면 값이 없음
	// List는 ArrayList의 부모라서 반환하는것이 List라도 상관없음
	public List<Product> findAll() {
		return new ArrayList<Product>(this.products.values());
	}
	
	public Product find(String id) {
		return this.products.get(id);
	}
	
}
