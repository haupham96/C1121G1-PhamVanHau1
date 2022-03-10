import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PersonServlet", value = "/PersonServlet")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();

    Person person1=new Person("Mai Văn A","1983-08-20","Hà Nội1","picture/1.png");
    Person person2=new Person("Mai Văn B","1983-08-21","Hà Nội2","picture/2.png");
    Person person3=new Person("Mai Văn C","1983-08-22","Hà Nội3","picture/3.png");
    Person person4=new Person("Mai Văn D","1983-08-23","Hà Nội4","picture/4.png");
    Person person5=new Person("Mai Văn E","1983-08-24","Hà Nội5","picture/5.png");

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        request.setAttribute("list",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
