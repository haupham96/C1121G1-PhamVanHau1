import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionnaryServlet", value = "/Dictionnary")
public class DictionnaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        Map<String,String> map = new HashMap<>();
        map.put("hello","Xin Chào");
        map.put("how","Như Thế Lào ?");
        map.put("book","quyển sách");
        map.put("computer","máy vi tính");
        String search = request.getParameter("search");
        String result = map.get(search);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<meta charset=\"UTF-8\">");
        printWriter.println("</head>");
        if(search != null && map.containsKey(search)){
            printWriter.println("<h1>"+"Search : "+search+"</h1>");
            printWriter.println("<h1>"+"Result : "+result+"</h1>");
        } else {
            printWriter.println("<h1>"+"Not found"+"</h1>");
        }
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
