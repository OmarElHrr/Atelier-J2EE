package com.example.atelier3_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modul.Etudiant;

import java.io.IOException;


@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
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

        EtudientSession etudientSession = new EtudientSession();
        Etudiant etudiant = new EtudientSession().creatEtudiant(Nom,Prenom,Date_de_naissance,CIN,Tele,Mail);
        etudientSession.ajouterEtudiant(etudiant);
        request.setAttribute("etudiant",etudiant);
        try {
            this.getServletContext().getRequestDispatcher("/affichage.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
