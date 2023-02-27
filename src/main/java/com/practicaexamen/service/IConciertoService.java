package com.practicaexamen.service;

import com.practicaexamen.entity.Concierto;
import java.util.List;

public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public void saveConcierto(Concierto concierto);
    public void delete(long id);
}
