package org.koushik.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.koushik.javabrains.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface IProductCatalog {

	// @Webmethod - annotation is optional . By default all public methods are considered as service operation
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCatagory();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	@WebResult(name="Product")
	List<Product> getProducts2(String category);

	@WebMethod
	boolean addProduct(String category, String product);

}