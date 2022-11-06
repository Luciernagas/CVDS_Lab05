package edu.eci.cvds.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.eci.cvds.servlet.model.Todo;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        urlPatterns = "/servlet"
)

public class Servlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        try {
            Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
            if (optId.isPresent()) {
                resp.setStatus(HttpServletResponse.SC_OK);
                ArrayList<Todo> TodoT = new ArrayList<Todo>();
                Todo elemento = Service.getTodo(Integer.parseInt(optId.get()));
                TodoT.add(elemento);
                responseWriter.write(Service.todosToHTMLTable(TodoT));
                responseWriter.flush();
            }

        } catch (NoSuchElementException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se ingreso ningun id");
        } catch (NumberFormatException e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido, se esperaba un entero");
        } catch (MalformedURLException e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno en el servidor");
        } catch (FileNotFoundException e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido");
        } catch (Exception e){
            responseWriter.write("Requerimiento invalido");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Writer responseWriter = resp.getWriter();
        try {
            Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
            if (optId.isPresent()) {
                resp.setStatus(HttpServletResponse.SC_OK);
                ArrayList<Todo> TodoT = new ArrayList<Todo>();
                Todo elemento = Service.getTodo(Integer.parseInt(optId.get()));
                TodoT.add(elemento);
                responseWriter.write(Service.todosToHTMLTable(TodoT));
                responseWriter.flush();
            }

        } catch (NoSuchElementException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("No se ingreso ningun id");
        } catch (NumberFormatException e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido, se esperaba un entero");
        } catch (MalformedURLException e){
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            responseWriter.write("Error interno en el servidor");
        } catch (FileNotFoundException e){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("Requerimiento invalido");
        } catch (Exception e){
            responseWriter.write("Requerimiento invalido");
        }
    }

}
