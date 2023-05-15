package ru.pegas_agro.model;

import lombok.Data;

import java.util.Date;
import java.util.HashMap;

@Data
public class PassedWay {

    private final HashMap<Date, String> wayForDay;

    public PassedWay(HashMap<Date, String> wayForDay) {
        this.wayForDay = wayForDay;
    }
}
