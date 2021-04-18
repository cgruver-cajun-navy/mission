package org.labmonkeys.cajun_navy.mission.dto;

import java.util.List;

import lombok.Data;

@Data
public class MissionDTO {
    public enum MissionStatus {CREATED,UPDATED,COMPLETED,FAILED,REJECTED};
    public enum ResponderLocationStatus {MOVING,PICKED_UP,DROPPED};
    private String missionId;
    private String incidentId;
    private String responderId;
    private LocationDTO responderStartLocation;
    private LocationDTO incidentLocation;
    private LocationDTO destination;
    private MissionStatus missionStatus;
    private ResponderLocationStatus responderLocationStatus;
    private List<ResponderBreadcrumbDTO> ResponderBreadcrumbs;
    private List<MissionStepDTO> steps;
}
