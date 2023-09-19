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
@Document(collection = "objArea")
 public class Area {

    @Field(name = "AreaNum")
    private int AreaNum;
    @Field(name = "AreaDesc")
    private String AreaDTest;
    @Field(name = "AreaCode")
    private String AreaCode;
    @Field(name = "HasCurrentOrder")
    private boolean HasCurrentOrderTest;
    @Field("objRow")
    private List<Row> objRow;

}
