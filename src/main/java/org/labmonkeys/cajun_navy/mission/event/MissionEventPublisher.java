package org.labmonkeys.cajun_navy.mission.event;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Message;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.labmonkeys.cajun_navy.mission.dto.MissionDTO;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.operators.multi.processors.UnicastProcessor;

@ApplicationScoped
public class MissionEventPublisher {
    
    private final UnicastProcessor<MissionDTO> missionProcessor = UnicastProcessor.create();
    private final UnicastProcessor<MissionDTO> responderProcessor = UnicastProcessor.create();

    @Outgoing("update-responder-available")
    public Multi<Message> responderEvent() {
        return null;
    }
}
