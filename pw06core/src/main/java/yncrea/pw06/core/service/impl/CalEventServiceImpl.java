package yncrea.pw06.core.service.impl;

import org.springframework.transaction.annotation.Transactional;
import yncrea.pw06.core.dao.CalEventDAO;
import yncrea.pw06.core.entity.CalEvent;
import yncrea.pw06.core.service.CalEventService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class CalEventServiceImpl implements CalEventService{

    @Inject
    private CalEventDAO calEventDAO;

    @Override
    public List<CalEvent> findAll() {
        return calEventDAO.findAll();
    }

    @Override
    public CalEvent findById(long id) {
        return calEventDAO.findById(id);
    }

    @Override
    public void saveCalEvent(CalEvent calEvent) {
        calEventDAO.save(calEvent);
    }
}