package ru.pegas_agro.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.pegas_agro.model.PassedWay;
import ru.pegas_agro.services.CalculateWay;

@Controller
@Slf4j
public class WebController {

    private final CalculateWay calculate;

    @Autowired
    public WebController(CalculateWay calculate) {
        this.calculate = calculate;
    }

    @GetMapping("/way")
    public String getWay(Model model) {
        log.info("Get request to calculate the way");
        model.addAttribute("way", new PassedWay(calculate.calculateWay()));
        return "nmea";
    }

    @GetMapping()
    public String title() {
        log.info("Get start page request");
        return "title";
    }
}
