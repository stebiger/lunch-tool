package de.oc.bestellApp.database;

import java.io.IOException;

import javax.servlet.ServletException;

import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.Server;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.hsqldb.server.Servlet;

public class DatabaseInitServlet extends Servlet {

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Starting HSQLDB database!");
		try {
			HsqlProperties p = new HsqlProperties();
			p.setProperty("server.database.0", "file:bestellAppDB");
			p.setProperty("server.dbname.0", "bestellAppDb");
			p.setProperty("server.port", "9001");
			Server server = new Server();

			server.setProperties(p);

			server.setLogWriter(null); // can use custom writer
			server.setErrWriter(null); // can use custom writer
			server.start();
		} catch (IOException | AclFormatException e) {
			throw new ServletException(e);
		}
	}
}
