package FIRSTDAO;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class EmbeddedJettyServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Add JSP support
        ServletHolder jspServlet = context.addServlet(org.eclipse.jetty.jsp.JettyJspServlet.class, "*.jsp");
        jspServlet.setInitParameter("classpath", context.getClassPath());
        jspServlet.setInitOrder(0);

        server.start();
        server.join();
    }
}
