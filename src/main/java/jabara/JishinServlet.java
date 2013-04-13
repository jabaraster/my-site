/**
 * 
 */
package jabara;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jabaraster
 */
@WebServlet(urlPatterns = { "/jishin" })
public class JishinServlet extends HttpServlet {
    private static final long serialVersionUID = 6943498500053570727L;

    /**
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest pReq, final HttpServletResponse pResp) throws IOException, ServletException {
        pReq.getRequestDispatcher("jishin.html").forward(pReq, pResp); //$NON-NLS-1$
    }
}
