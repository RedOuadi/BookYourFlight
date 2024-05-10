package metier;

import javax.persistence.*;

@Entity
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String CIN; // Assuming CIN is a unique identifier for the passenger
    @ManyToOne
    private Vol vol; // Association with Vol
    @ManyToOne
    private Siege siege; // Association with Siege

    public Passager() {
        // Default constructor required by Hibernate
    }

    public Passager(String nom, String prenom, String CIN, Vol vol, Siege siege) {
        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
        this.vol = vol;
        this.siege = siege;
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

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Siege getSiege() {
        return siege;
    }

    public void setSiege(Siege siege) {
        this.siege = siege;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", CIN='" + CIN + '\'' +
                ", vol=" + vol +
                ", siege=" + siege +
                '}';
    }
}
