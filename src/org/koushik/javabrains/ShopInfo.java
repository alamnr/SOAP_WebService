package org.koushik.javabrains;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;



@WebService
// When do you use document  and when do you use rpc style, though document is default
//@SOAPBinding(style=Style.RPC) // When RPC style is used , no schema gets generated for types
@SOAPBinding(style=Style.DOCUMENT) // use document for complex schema type
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutPut")
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException{
		String response = "Invalid property";
		
		if("shopName".equals(property)){
			response = "Test Mart";
		}
		else if("since".equals(property)){
			response ="since 2012";
		}
		else{
			throw new InvalidInputException("Invalid Input", property+ " is not valid input.");
		}
		
		return response;
	}

}
