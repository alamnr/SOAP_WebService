package org.koushik.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.koushik.javabrains.business.ProductServiceImpl;
import org.koushik.javabrains.model.Product;


@WebService(endpointInterface="org.koushik.javabrains.IProductCatalog")
public class ProductCatalog implements   IProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl(); 
	
	 // @Webmethod - annotation is optional . By default all public methods are considered as service operation
	/* (non-Javadoc)
	 * @see org.koushik.javabrains.IProductCatalog#getProductCatagory()
	 */
	@Override
	
	public List<String> getProductCatagory(){
		
		return productService.getProductCatagory();
		
		
	}
	
	/* (non-Javadoc)
	 * @see org.koushik.javabrains.IProductCatalog#getProducts(java.lang.String)
	 */
	@Override
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.koushik.javabrains.IProductCatalog#getProducts2(java.lang.String)
	 */
	@Override
	
	public List<Product> getProducts2(String category){
		return productService.getProductsV2(category);
	}
	

	/* (non-Javadoc)
	 * @see org.koushik.javabrains.IProductCatalog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
		 
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}

}
