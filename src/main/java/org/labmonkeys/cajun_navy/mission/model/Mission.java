package org.labmonkeys.cajun_navy.mission.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.labmonkeys.cajun_navy.mission.dto.MissionDTO.MissionStatus;
import org.labmonkeys.cajun_navy.mission.dto.MissionDTO.ResponderLocationStatus;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "mission")
public class Mission extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    
    @Column(name = "mission_id", updatable = false, nullable = false, unique = true)
    private String missionId;

    @Column(name = "incident_id", updatable = false, nullable = false, unique = true)
    private String incidentId;

    @Column(name = "responder_id", updatable = false, nullable = false, unique = true)
    private String responderId;

    @Column(name = "responder_start_latitude")
    private String responderStartLatitude;

    @Column(name = "responder_start_longitude")
    private String responderStartLongitude;

    @Column(name = "incident_latitude")
    private String incidentLat;

    @Column(name = "incident_longitude")
    private String incidentLong;

    @Column(name = "shelter_latitude")
    private String shelterLatitude;

    @Column(name = "shelter_longitude")
    private String shelterLongitude;

    @Column(name = "responder_id")
    private MissionStatus missionStatus;

    @Column(name = "responder_id")
    private ResponderLocationStatus responderLocationStatus;

    
    private List<ResponderBreadcrumb> ResponderBreadcrumbs;
    private List<MissionStep> steps;
}
