package web;

import hibernate.dao.HibernateDAO;
import hibernate.dao.HibernateDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Compagnie;
import metier.Vol;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SaveServlet", value = "/save")

public class save extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateDAO hibernateDAO = new HibernateDAOImpl();
        String villeDepart = request.getParameter("ville_depart");
        String dateDepartStr = request.getParameter("date_depart");
        String destination = request.getParameter("destination");
        int nombrePassagers = Integer.parseInt(request.getParameter("nombre_passagers"));
        double prix = Double.parseDouble(request.getParameter("prix"));
        String nomCompagnie = request.getParameter("compagnie");

        // Convertir la date de départ en objet Date
        Date dateDepart = null;
        try {
            dateDepart = new SimpleDateFormat("yyyy-MM-dd").parse(dateDepartStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Créer une nouvelle compagnie
        Compagnie compagnie = new Compagnie();
        compagnie.setNom(nomCompagnie);

        // Créer un nouveau vol
        Vol vol = new Vol(villeDepart, dateDepart, destination, nombrePassagers, prix, compagnie);

        // Enregistrer le vol dans la base de données
        try {
            hibernateDAO.save(vol);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Réservation enregistrée avec succès");
    }
}






