package com.viperbloke.cerberus_backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.viperbloke.cerberus_backend.model.dto.BeaconDTO;

@RestController
public class ImplantController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImplantController.class);

    /**
     * Endpoint for an implant to beacon to. This sets the implant to "active" in
     * the implants list.
     * TODO return the list, receive as param the beacon info
     */
    @PostMapping("/beacon")
    public void beacon(@RequestBody BeaconDTO beaconDTO) {
        LOGGER.debug(String.format("Beacon received: %s", beaconDTO.toString()));
    }
}
