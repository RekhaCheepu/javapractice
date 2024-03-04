package dynamic_array;

import java.util.HashMap;
import java.util.Map;

public class ProductLogin {
	public static String getProductInfo(String product) {
		Map<String,String>productMap=new HashMap<String,String>();
		
		productMap.put("phone","iphone ;989.99");
		productMap.put("desktop","macbook;1299.98");
		productMap.put("tv","HDtv;1500.89");
		productMap.put("cooking","AirFryer;113.78");
		
		return productMap.get(product);
		
	}
	public static String getProductName(String product) {
		String prodcreds=getProductInfo(product);
		return prodcreds.split(";")[0];
	}
	public static String getProductPrice(String product) {
		String prodcreds=getProductInfo(product);
		return prodcreds.split(";")[1];
	}

	public static void main(String[] args) {
	String name=	getProductName("desktop");
	
	String price=getProductPrice("desktop");
	
	System.out.println(name+" "+price);
	}

}
