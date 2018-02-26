package yncrea.pw06.web.controller;

import yncrea.pw06.core.entity.CalEvent;

import java.util.List;

public interface RestController {
    List<CalEvent> getListOfCalEvent();

    CalEvent getCalEventById(long id);

    void submitForm(CalEvent calEvent);

}
