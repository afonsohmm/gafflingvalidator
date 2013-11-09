package org.peimari;

import java.awt.Desktop;
import java.net.URL;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import com.vaadin.server.VaadinServlet;

public class TServer {

	private static final int PORT = 8888;

	/**
	 * 
	 * Test server for the addon.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Server server = startServer(PORT);
		openWebpage("http://localhost:"+ PORT + "/");
	}
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static Server startServer(int port) throws Exception {

		Server server = new Server();

		final Connector connector = new SelectChannelConnector();

		connector.setPort(port);
		server.setConnectors(new Connector[] { connector });

		WebAppContext context = new WebAppContext();
		VaadinServlet vaadinServlet = new VaadinServlet() {
		};

		ServletHolder servletHolder = new ServletHolder(vaadinServlet);
		servletHolder.setInitParameter("ui", GafflingChecker.class.getName());

		context.setWar(System.getProperty("user.dir"));
		context.setContextPath("/");

		context.addServlet(servletHolder, "/*");
		server.setHandler(context);
		server.start();
		return server;
	}
}
