package chap08;

import java.util.*;

public class CartBean {

	// 대분류 두가지 기능(로그인, 장바구니)
	private final String ID = "seong";
	private final String PASSWD = "6789";
	ArrayList<String> cart;
	
	public CartBean() {
		cart = new ArrayList<String>();
	}
	
	public boolean checkLogin(String id, String passwd) {
		boolean result = false;
		
		if(id != null && id.equals(this.ID) && passwd != null && passwd.equals(this.PASSWD)) {
			result = true;
		}
		
		return result;
	}
	
	// 장바구니에서는 3가지 기능(장바구니 모두 보여주기, 장바구니에 하나의 상품을 추가, 장바구니 비우기)
	public ArrayList<String> getCart(){
		return this.cart;
	}
	
	public void addCart(String product) {
		this.cart.add(product);
	}
	
	public void clearCart() {
		this.cart.clear();
	}
	
}
