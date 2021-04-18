package org.labmonkeys.cajun_navy.mission.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class LocationDTO {
    private BigDecimal latitude;
    private BigDecimal longitude;
}
