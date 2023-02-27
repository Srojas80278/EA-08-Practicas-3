package com.practicaexamen.repository;

import com.practicaexamen.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{ //Concierto de entity
    
    
}
