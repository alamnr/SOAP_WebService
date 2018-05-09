package org.koushik.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.koushik.javabrains.business.ProductServiceImpl;


@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl(); 
	
	@WebMethod // @Webmethod - annotation is optional . By default all public methods are considered as service operation
	public List<String> getProductCatagory(){
		
		return productService.getProductCatagory();
		
		
	}
	
	@WebMethod(exclude=true)
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}

}
