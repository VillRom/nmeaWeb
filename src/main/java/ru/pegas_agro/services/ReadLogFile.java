package ru.pegas_agro.services;

import net.sf.marineapi.nmea.sentence.Sentence;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface ReadLogFile {

    HashMap<Date, List<Sentence>> splitByDays();
}
