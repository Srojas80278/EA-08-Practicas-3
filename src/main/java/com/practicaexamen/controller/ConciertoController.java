package com.practicaexamen.controller;

import com.practicaexamen.entity.Concierto;
import com.practicaexamen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/concierto")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla conciertos");
        model.addAttribute("conciertos", listaConcierto);
        return "conciertos";
    }

    @GetMapping("/concierto/crear")
    public String formulario(Model model) {
        Concierto concierto = new Concierto();
        model.addAttribute("concierto", concierto);
        return "crear";
    }

    @PostMapping("/concierto")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
/*
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
*/
}
