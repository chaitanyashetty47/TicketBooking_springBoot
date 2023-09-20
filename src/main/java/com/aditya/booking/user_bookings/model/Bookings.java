package com.aditya.booking.user_bookings.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    private Integer id;

    private Integer area_id;
    private Integer row_id;
    private Integer seat_id;
    @Column(name = "show_id", nullable = false)
    private Integer showId;
    private Integer user_id;
}
