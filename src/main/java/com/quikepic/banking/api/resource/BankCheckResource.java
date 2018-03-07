package com.quikepic.banking.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@Path("/rest")
public class BankCheckResource {
	
private final Log log = LogFactory.getLog(getClass());
	
	@POST
	@Path("/validateAccount")
	@Consumes("application/json")
	@Produces("application/json")
	@PreAuthorize("hasAuthority('FOO_WRITE')")
	public String validateAccount() {
		this.log.info("BankCheckResource :: getCallDetails");
		return "Your Account is Valid";
	}

}
