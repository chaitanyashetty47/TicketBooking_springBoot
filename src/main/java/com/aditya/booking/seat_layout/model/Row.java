package com.aditya.booking.seat_layout.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

 @AllArgsConstructor
@NoArgsConstructor
@Data
public class Row {
    @Field("GridRowId")
    private int GridRowId;
    @Field("PhyRowId")
    private String PhyRowId;
    @Field("objSeat")
    private List<Seat> objSeat;
}
