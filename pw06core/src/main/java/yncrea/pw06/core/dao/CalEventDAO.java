package yncrea.pw06.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.pw06.core.entity.CalEvent;

public interface CalEventDAO extends JpaRepository<CalEvent,Long> {

    CalEvent findById(long id);
}
