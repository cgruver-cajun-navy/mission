package org.labmonkeys.cajun_navy.mission.dto;

import lombok.Data;

@Data
public class MissionEvent {
    public static enum MissionEventType{MISSION_STARTED,VICTIM_PICKED_UP,VICTIM_DELIVERED};

    private String missionId;
    private String incidentId;
}
