package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String Tle; // Assuming Tle is a type of identifier or title

    public Client() {
        // Default constructor required by Hibernate
    }

    public Client(String nom, String prenom, String Tle) {
        this.nom = nom;
        this.prenom = prenom;
        this.Tle = Tle;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTle() {
        return Tle;
    }

    public void setTle(String Tle) {
        this.Tle = Tle;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", Tle='" + Tle + '\'' +
                '}';
    }
}

