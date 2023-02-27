package com.practicaexamen.controller;
import com.practicaexamen.entity.Concierto;
import com.practicaexamen.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla conciertos");
        model.addAttribute("concierto", listaConcierto);
        return "conciertos";
    }
    
    
//    @GetMapping("/conciertoN")
//    public String CrearConcierto(Model model){
//        List<Pais> listaPaises = paisService.listCountry();
//        model.addAttribute("concierto", new Concierto());
//        model.addAttribute("paises", listaPaises);
//        return "crear";
//    }
    
     @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }

    
    
    
    
}
