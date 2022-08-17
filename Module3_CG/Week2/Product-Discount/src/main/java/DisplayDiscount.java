import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscount" , value = "/display-discount")
public class DisplayDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Des = req.getParameter("txtDes");
        float price = Float.parseFloat(req.getParameter("txtPrice"));
        float percent = Float.parseFloat(req.getParameter("txtDiscount"));

        float amount = (float) (price * percent * 0.01);
        float newPrice = price - amount;

        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<p> Mô tả của sản phẩm là: " + Des + "</p>");
        writer.println("<p> Giá niêm yết của sản phẩm: " + price + "</p>");
        writer.println("<p> Tỷ lệ chiết khấu (phần trăm): " + percent + "</p>");
        writer.println("<p> Lượng chiết khấu: " + amount + "</p>");
        writer.println("<p> Giá sau khi đã được chiết khấu: " + newPrice + "</p>");
        writer.println("</html>");
    }
}
