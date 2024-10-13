package dev.manohar.ticketbooking.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class  Auditorium extends BaseModel{
    private String auditoriumName;
    @OneToMany
    private List<Seat> seats;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> features;

}
