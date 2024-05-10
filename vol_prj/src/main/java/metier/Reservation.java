package metier;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @ManyToOne
    private Client client; // Association with Client
    @OneToMany
    private ArrayList<Passager> passagers; // Association with Passager

    public Reservation() {
        // Default constructor required by Hibernate
    }

    public Reservation(Date date, Client client, ArrayList<Passager> passagers) {
        this.date = date;
        this.client = client;
        this.passagers = passagers;
    }

    public void creer() {
        // Implementation
    }

    public void modifier() {
        // Implementation
    }

    public void annuler() {
        // Implementation
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Passager> getPassagers() {
        return passagers;
    }

    public void setPassagers(ArrayList<Passager> passagers) {
        this.passagers = passagers;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", client=" + client +
                ", passagers=" + passagers +
                '}';
    }
}

