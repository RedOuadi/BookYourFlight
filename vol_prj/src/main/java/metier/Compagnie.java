package metier;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compagnie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "compagnie")
    private List<Vol> vols; // Association with Vol

    public Compagnie() {
        // Default constructor required by Hibernate
    }

    public Compagnie(String nom, List<Vol> vols) {
        this.nom = nom;
        this.vols = vols;
    }

    public void creer() {
        // Implementation
    }

    public void affiche() {
        // Implementation
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

    public List<Vol> getVols() {
        return vols;
    }

    public void setVols(List<Vol> vols) {
        this.vols = vols;
    }

    @Override
    public String toString() {
        return "Compagnie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", vols=" + vols +
                '}';
    }
}
