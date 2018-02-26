package yncrea.pw06.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yncrea.pw06.core.entity.CalEvent;
import yncrea.pw06.core.service.CalEventService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Named
@Path("/calevents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CalEventController implements RestController {

    private static final Logger logger = LoggerFactory.getLogger(CalEventController.class);

    @Inject
    private CalEventService calEventService;

    @GET
    @Path("/")
    public List<CalEvent> getListOfCalEvent() {
        logger.info("get all CalEvents");
        return calEventService.findAll();
    }

    @GET
    @Path("/{calEvent.id}")
    public CalEvent getCalEventById(@PathParam("calEvent.id") long id) {
        logger.info("get CalEvent with id = ", id);
        return calEventService.findById(id);
    }

    @POST
    @Path("/")
    public void submitForm(CalEvent calEvent) {
        logger.info("new CalEvent saved");
        calEventService.saveCalEvent(calEvent);
    }

}