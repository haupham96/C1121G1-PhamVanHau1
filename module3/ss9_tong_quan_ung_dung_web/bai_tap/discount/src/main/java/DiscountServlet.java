import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/Discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        float price = Float.parseFloat(request.getParameter("price"));
        int discountPercent = Integer.parseInt(request.getParameter("discount"));
        float discountPrice = (float) (price * discountPercent * 0.01);
        float lastPrice = price - discountPrice ;
        String discription = request.getParameter("discripton");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<meta charset=\"UTF-8\">");
        printWriter.println("</head>");
        printWriter.println("<h1> Product : "+ discription +"</h1>");
        printWriter.println("<h1> Price : "+ price +"</h1>");
        printWriter.println("<h1> Discount Percent : "+ discountPercent +" % " +"</h1>");
        printWriter.println("<h1> Discount Price : "+ discountPrice +"</h1>");
        printWriter.println("<h1> Last Price : "+ lastPrice +"</h1>");
        printWriter.println("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
