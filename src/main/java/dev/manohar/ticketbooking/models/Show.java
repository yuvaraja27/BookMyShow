package dev.manohar.ticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    private String language;
    @OneToMany
    private List<ShowSeat> showSeat;
    @Enumerated(EnumType.STRING)
    private ShowStatus showStatus;
}
