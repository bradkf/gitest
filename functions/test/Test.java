import java.util.logging.Logger;
import java.util.logging.Level;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalyst.advanced.CatalystAdvancedIOHandler;

public class Test implements CatalystAdvancedIOHandler {
	private static final Logger LOGGER = Logger.getLogger(Test.class.getName());
	
	@Override
    public void runner(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			String name = (String) request.getParameter("name");
			LOGGER.log(Level.INFO, "Hellosadfasdfas "+name);
			response.setStatus(200);
		}
		catch(Exception e) {
			LOGGER.log(Level.SEVERE,"Exception in Test",e);
			response.setStatus(500);
		}
        response.getWriter().write("Hello From Test.java");
	}
	
}