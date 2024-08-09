package com.viperbloke.cerberus_backend.model.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viperbloke.cerberus_backend.model.entity.ImplantDAO;

public interface ImplantRepository extends JpaRepository<ImplantDAO, UUID> {
    ImplantDAO save(ImplantDAO implant);

    Optional<ImplantDAO> findById(UUID uuid);
}
