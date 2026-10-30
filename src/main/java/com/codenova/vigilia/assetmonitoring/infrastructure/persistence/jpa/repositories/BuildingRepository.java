package com.codenova.vigilia.assetmonitoring.infrastructure.persistence.jpa.repositories;

import com.codenova.vigilia.assetmonitoring.domain.model.aggregates.Building;
import com.codenova.vigilia.assetmonitoring.domain.model.valueobjects.BuildingCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Persistence access for buildings.
 */
@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
    boolean existsByCode(BuildingCode code);
}