import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/Calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));

        String calculate = request.getParameter("select");

        printWriter.println("<html>");
        printWriter.println("<h1>Result : </h1>");
        if(calculate.equals("Add")){
            printWriter.println("<p>"+firstOperand+" + "+secondOperand+" = "+(firstOperand+secondOperand)+"</p>");
        } else if (calculate.equals("Sub")){
            printWriter.println("<p>"+firstOperand+" - "+secondOperand+" = "+(firstOperand-secondOperand)+"</p>");
        } else if (calculate.equals("Mul")){
            printWriter.println("<p>"+firstOperand+" x "+secondOperand+" = "+(firstOperand*secondOperand)+"</p>");
        } else {
            printWriter.println("<p>"+firstOperand+" : "+secondOperand+" = "+(firstOperand/secondOperand)+"</p>");
        }
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
