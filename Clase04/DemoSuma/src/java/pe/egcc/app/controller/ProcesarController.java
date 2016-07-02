package pe.egcc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.ejb.MateEjbRemote;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
@WebServlet(name = "ProcesarController", urlPatterns = {"/ProcesarController"})
public class ProcesarController extends HttpServlet {

  @EJB
  private MateEjbRemote mateEjb;

  
  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    // Datos
    int n1 = Integer.parseInt(request.getParameter("nu1"));
    int n2 = Integer.parseInt(request.getParameter("nu2"));
    // Proceso
    int suma = mateEjb.sumar(n1, n2);
    // Reporte
    request.setAttribute("n1", n1);
    request.setAttribute("n2", n2);
    request.setAttribute("suma", suma);
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("procesar.jsp");
    rd.forward(request, response);
    
  }
  
  
}