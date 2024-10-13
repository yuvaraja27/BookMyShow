package dev.manohar.ticketbooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private double totalCost;
    private LocalDateTime bookingTime;
    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @ManyToOne
    private User user;
    private TicketStatus ticketStatus;
}
