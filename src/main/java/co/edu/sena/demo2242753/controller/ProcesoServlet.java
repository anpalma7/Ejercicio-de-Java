package co.edu.sena.demo2242753.controller;

import co.edu.sena.demo2242753.model.Trabajador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class ProcesoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String documento = request.getParameter("documento");
        String díasTrabajados = request.getParameter("díasTrabajados");
        String sueldoMensual = request.getParameter("sueldoMensual");

        String error = "";

        if (nombres.trim().equals("")) {
            error = "Complete los campos.";
            request.getSession().setAttribute("error", error);
            request.getRequestDispatcher("error.jsp");
        }
        else{
            int doc=0;
            int dia=0;
            try {
                doc = Integer.parseInt(documento) ;
                dia = Integer.parseInt(díasTrabajados) ;
            }
            catch(NumberFormatException e){
                error = "Ingrese solo números.";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("error.jsp");
            }

            Trabajador t1 = new Trabajador (nombres, apellidos, documento, díasTrabajados, sueldoMensual);

            ArrayList<Trabajador> Trabajadores = (ArrayList<Trabajador>) request.getSession(). getAttribute("Trabajadores");

            if (Trabajadores == null) {
                Trabajadores = new ArrayList();
                Trabajadores.add(t1);
                request.getSession().setAttribute("Trabajadores", Trabajadores);
                request.getRequestDispatcher("exito.jps").forward(request, response);
            }
            else {
                boolean encontrado = false;
                for (int i = 0; 1 < Trabajadores.size(); i++) {
                    if (Trabajadores.get(i).getNombres().equals(nombres)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    Trabajadores.add(t1);
                    Object trabajadores = request.getSession().getAttribute("Trabajadores", Trabajadores);
                    request.getRequestDispatcher("exito,jsp").forward(request, response);
                }
                else {
                    error = "El nombre ya existe";
                    request.getSession().setAttribute("error", error);
                    request.getRequestDispatcher("error.jsp");
                }
            }
        }
    }
}
