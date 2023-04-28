package com.example.ateiler_1;

import com.model.Etudiant;
import com.model.Inscription;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Save", value = "/Save")
public class Save extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Nom    = request.getParameter("nom");
        String Prenom = request.getParameter("prenom");
        String Date_de_naissance = request.getParameter("date_naissance");
        String CIN    = request.getParameter("cin");
        String Tele   = request.getParameter("tel");
        String Mail   = request.getParameter("email");

        String date_inscription =request.getParameter("date_inscription");
        String filier =request.getParameter("filier");
        String groupe=request.getParameter("groupe");
        String niveau=request.getParameter("niveau");
        String cycle=request.getParameter("cycle");
        int nombre_annees= Integer.parseInt(request.getParameter("nombre_annees"));

        Etudiant etudiant = new Etudiant(Nom,Prenom,Date_de_naissance,CIN,Tele,Mail);
        Inscription inscription =  new Inscription(etudiant,date_inscription,filier, groupe,niveau,cycle,nombre_annees);

        request.setAttribute("etudiant",etudiant);
        request.setAttribute("inscription",inscription);
        this.getServletContext().getRequestDispatcher("/affichege.jsp").forward(request,response);
    }
}
