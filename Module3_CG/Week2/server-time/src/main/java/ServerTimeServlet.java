import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet" , urlPatterns = "/index")
public class ServerTimeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date today = new Date();

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>" + today + "</h1>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}