package org.avows.inter.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class CurdClient extends RestTemplate  {

	@Value("${service.url.crud}")
	protected String reportsURL;
	
	public CurdClient() {
		super();
	}
	
	public CurdClient getCurdClient() {
		return new CurdClient();
	}
}
