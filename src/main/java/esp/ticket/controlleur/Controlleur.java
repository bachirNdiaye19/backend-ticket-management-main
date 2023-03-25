package esp.ticket.controlleur;

import esp.ticket.model.Ticket;
import esp.ticket.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ticket")
public class Controlleur {

    @Autowired
    private Repository repoticket;

    @GetMapping
    public List<Ticket> getTicket(){
        return  repoticket.findAll();
    }

    @PostMapping
    public void postTicket(@RequestBody Ticket ticket){
        repoticket.save(ticket);
    }
    
    //Un petit comm

    @PutMapping("/{id}")
    public void putTicket(@RequestBody Ticket ticket,@PathVariable Long id){
        String fullname = ticket.getFullname();
        String description = ticket.getDescription();
        String email = ticket.getEmail();

        ticket.setId(id);
        ticket.setFullname(fullname);
        ticket.setEmail(email);
        ticket.setDescription(description);
        repoticket.save(ticket);

    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id){
        repoticket.deleteById(id);
    }

}
