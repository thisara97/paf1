package com.bill.BilGenerate;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Bill")

public class BillgenerateResourse {

  @GET
  @Produces(MediaType.APPLICATION_JSON);
  public Billgenerate getAllBillgenerate() {


   List<Billgenerate> billgenerate = new ArrayList<Billgenerate>();
		
		Billgenerate b1 = new Billgenerate();
		b1.setName("navod");
		b1.setAddress("dodangoda");
		b1.setAccno(234);
		b1.setMeterreading(1); 
		b1.setPrice(234);
		
		Billgenerate.add(b1);
		
		return bill;
	}
}