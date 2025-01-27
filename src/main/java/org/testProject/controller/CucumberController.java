package org.testProject.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.testProject.model.Cucumber;
import org.testProject.service.CucumberService;

import java.util.List;

@Path("/cucumber")
@Slf4j
public class CucumberController {

    private CucumberService cucumberService;

    @Inject
    public CucumberController(CucumberService cucumberService) {
        this.cucumberService = cucumberService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cucumber> getCucumbers(@QueryParam("q") int quantity) {
        log.info("Getting cucumbers..");
        return cucumberService.getCucumbers(quantity);
    }
}
