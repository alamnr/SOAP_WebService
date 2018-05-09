package org.koushik.javabrains;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


@WebService
public class ProductCatalog {
	
	public List<String> getProductCatagory(){
		
		List<String> categories = new ArrayList();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

}
