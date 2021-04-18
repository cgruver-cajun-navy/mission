package org.labmonkeys.cajun_navy.mission.dto;

import lombok.Data;

@Data
public class MissionStepDTO {
    public static enum MissionStepType{WAY_POINT, DESTINATION};
    LocationDTO location;
    MissionStepType stepType;
}
