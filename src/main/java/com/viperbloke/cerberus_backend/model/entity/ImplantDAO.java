package com.viperbloke.cerberus_backend.model.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ImplantDAO {
    @Id
    private UUID id;
    private String ip;
    private String os;
    private long beaconIntervalMS;

    public ImplantDAO(UUID id, String ip, String os, long beaconIntervalMS) {
        this.id = id;
        this.ip = ip;
        this.os = os;
        this.beaconIntervalMS = beaconIntervalMS;
    }
}
