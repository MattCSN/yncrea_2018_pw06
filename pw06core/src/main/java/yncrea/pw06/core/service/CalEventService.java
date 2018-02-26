package yncrea.pw06.core.service;

import yncrea.pw06.core.entity.CalEvent;

import java.util.List;

public interface CalEventService {

    List<CalEvent> findAll();

    CalEvent findById(long id);

    void saveCalEvent(CalEvent calEvent);
}