package com.proyecto_final_hlc.repositories;

import com.proyecto_final_hlc.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
