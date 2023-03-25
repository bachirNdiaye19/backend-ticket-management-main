package esp.ticket.model;

import jakarta.persistence.*;


@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String email;

    private String description;
    private String etatTicket="En traitement";

//Constructeurs pour Test

    public Ticket() {
    }

    public Ticket(Long id, String fullname, String description, String etatTicket, String email) {
        this.id = id;
        this.fullname = fullname;
        this.description = description;
        this.etatTicket = etatTicket;
        this.email=email;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEtatTicket(String etatTicket) {
        this.etatTicket = etatTicket;
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDescription() {
        return description;
    }

    public String getEtatTicket() {
        return etatTicket;
    }
}
