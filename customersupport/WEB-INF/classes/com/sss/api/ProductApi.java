package com.sss.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gsoft.pojo.CustPojo;
import com.gsoft.service.CustService;

/**
 * @author Santhosh
 *
 */
@Path("/api/product")
public class ProductApi {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<CustPojo> getProductsList(){
		CustService service = new CustService();
		return service.getCustomers();
	}

}
