package com.practicaexamen.controller;

import com.practicaexamen.entity.Concierto;
import com.practicaexamen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla conciertos");
        model.addAttribute("conciertos", listaConcierto);
        return "conciertos";
    }

    @GetMapping("/agregar")
    public String agregar(Concierto concierto) {
        return "crear";
    }

    @PostMapping("/guardar")
    public String guardar(Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/";
    }

    @GetMapping("/eliminar")
    public String eliminar(Concierto concierto) {
        conciertoService.delete(concierto.getId());
        return "redirect:/";
    }
    
/*
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
*/
}
