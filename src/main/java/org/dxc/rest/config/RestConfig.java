package org.dxc.rest.config;

import org.dxc.rest.resources.EmployeeResources;
import org.glassfish.jersey.server.ResourceConfig;

public class RestConfig extends ResourceConfig {

	public RestConfig(Class<?>... classes) {
		super(classes);
     register(EmployeeResources.class);
	}

}
