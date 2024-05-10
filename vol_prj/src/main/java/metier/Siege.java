package metier;

import javax.persistence.*;

@Entity
public class Siege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int num; // Assuming 'num' is the seat number

    public Siege() {
        // Default constructor required by Hibernate
    }

    public Siege(int num) {
        this.num = num;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Siege{" +
                "id=" + id +
                ", num=" + num +
                '}';
    }
}

