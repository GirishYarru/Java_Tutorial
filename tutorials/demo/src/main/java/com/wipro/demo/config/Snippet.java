/*
 * package com.wipro.demo.config;
 * 
 * import org.apache.coyote.http11.AbstractHttp11Protocol; import
 * org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
 * import org.springframework.context.annotation.Bean;
 * 
 * public class Snippet {
 * 
 * @Bean public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {
 * 
 * TomcatEmbeddedServletContainerFactory tomcat = new
 * TomcatEmbeddedServletContainerFactory();
 * 
 * tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> { if
 * ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
 * //-1 means unlimited ((AbstractHttp11Protocol<?>)
 * connector.getProtocolHandler()).setMaxSwallowSize(-1); } });
 * 
 * return tomcat;
 * 
 * } }
 * 
 */