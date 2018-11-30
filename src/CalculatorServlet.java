import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float firstoperand = Float.parseFloat(request.getParameter("first operand"));
        float secondoperand = Float.parseFloat(request.getParameter("second operand"));
        String operator = request.getParameter("operator");


        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("addition".equals(operator)) {
            writer.print("<h1>Result:" + "<br>");
            float resultaddition = firstoperand + secondoperand;
            writer.println(firstoperand + " + " + secondoperand + " = " + resultaddition);

        } else if ("subtraction".equals(operator)) {
            writer.println("<h1>Result:" + "<br>");
            float resultsubtraction = firstoperand - secondoperand;
            writer.println(firstoperand + " - " + secondoperand + " = " + resultsubtraction);
        } else if ("multiplication".equals(operator)) {
            writer.println("<h1>Result:" + "<br>");
            float resultmultiplication = firstoperand * secondoperand;
            writer.println(firstoperand + " * " + secondoperand + " = " + resultmultiplication);
        } else if ("division".equals(operator)) {
            if (secondoperand == 0) {
                writer.println("<h1>Error: Can't divide to zero</h1>");
            } else {
                writer.println("<h1>Result:" + "<br>");
                float resultdivision = firstoperand / secondoperand;
                writer.println(firstoperand + " / " + secondoperand + " = " + resultdivision);
            }
        }
        writer.println("</html>");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
