/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Modal.ItemDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ankit
 */
public class Item extends HttpServlet {

  
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       String itemname = request.getParameter("al");
        
       System.out.println(itemname);
        
        ItemDAO hd = new ItemDAO();
        
        ArrayList<Modal.Item> ld = new ArrayList<>();
        
        ld = hd.searchItems(itemname);
        
        HttpSession session = request.getSession();
        
        session.setAttribute("itemlist",ld);
        
        response.sendRedirect("bill.jsp");
    }

   
}
