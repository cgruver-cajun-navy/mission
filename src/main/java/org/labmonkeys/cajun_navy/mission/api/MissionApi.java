package org.labmonkeys.cajun_navy.mission.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.core.eventbus.EventBus;

@ApplicationScoped
@Path("/")
public class MissionApi {
    
    @Inject
    EventBus bus;

    @GET
    @Path("missions")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> missions() {
        return null;
    }

    @GET
    @Path("missions/{missionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getMission() {
        return null;
    }

    @GET
    @Path("missions/responder/{responderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getMissionByResponderId() {
        return null;
    }

    @POST
    @Path("missions/clear")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> clearMissions() {
        return null;
    }
}
