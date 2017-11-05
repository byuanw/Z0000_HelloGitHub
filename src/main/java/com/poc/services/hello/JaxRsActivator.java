package com.poc.services.hello;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class JaxRsActivator extends Application {
   /* No-op. This is just a marker class that the scanner finds and deploys this as a JAX-RS svc */
}
