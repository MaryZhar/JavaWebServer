package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;
;
/**
 * @author Mary
 */
public class Main {
    public static void main(String[] args) throws Exception{
        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet),"/*");

        Server server = new Server(8081);
        server.setHandler(context);

        server.start();
        server.join();

    }
}
