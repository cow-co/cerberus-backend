package com.viperbloke.cerberus_backend.model.dto;

import java.util.UUID;

public class BeaconDTO {
    private UUID uuid;
    private String ip;
    private String os;
    private long beaconIntervalMS;

    public BeaconDTO(UUID uuid, String ip, String os, long beaconIntervalMS) {
        this.uuid = uuid;
        this.ip = ip;
        this.os = os;
        this.beaconIntervalMS = beaconIntervalMS;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getIp() {
        return ip;
    }

    public String getOs() {
        return os;
    }

    public long getBeaconIntervalMS() {
        return beaconIntervalMS;
    }

    @Override
    public String toString() {
        return "BeaconDTO [uuid=" + uuid + ", ip=" + ip + ", os=" + os + ", beaconIntervalMS=" + beaconIntervalMS + "]";
    }
}
