package esp.ticket.repository;

import esp.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Ticket,Long> {

}
