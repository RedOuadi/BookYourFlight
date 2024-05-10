package metier;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ville_depart;
    private Date date_depart;
    private String destination;
    private int nombre_passagers; // Assuming this is a typo and should be 'nombre_passagers' for number of passengers
    private double prix;
    @ManyToOne
    private Compagnie compagnie; // Association with Compagnie

    public Vol() {
        // Default constructor required by Hibernate
    }

    public Vol(String ville_depart, Date date_depart, String destination, int nombre_passagers, double prix, Compagnie compagnie) {
        this.ville_depart = ville_depart;
        this.date_depart = date_depart;
        this.destination = destination;
        this.nombre_passagers = nombre_passagers;
        this.prix = prix;
        this.compagnie = compagnie;
    }

    public void ouvrirVol() {
        // Implementation
    }

    public void fermerVol() {
        // Implementation
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNombre_passagers() {
        return nombre_passagers;
    }

    public void setNombre_passagers(int nombre_passagers) {
        this.nombre_passagers = nombre_passagers;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "id=" + id +
                ", ville_depart='" + ville_depart + '\'' +
                ", date_depart=" + date_depart +
                ", destination='" + destination + '\'' +
                ", nombre_passagers='" + nombre_passagers + '\'' +
                ", prix=" + prix +
                ", compagnie=" + compagnie +
                '}';
    }
}
