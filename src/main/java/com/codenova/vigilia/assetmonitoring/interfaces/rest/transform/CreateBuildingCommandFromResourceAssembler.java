package com.codenova.vigilia.assetmonitoring.interfaces.rest.transform;

import com.codenova.vigilia.assetmonitoring.domain.model.commands.CreateBuildingCommand;
import com.codenova.vigilia.assetmonitoring.domain.model.valueobjects.BuildingCode;
import com.codenova.vigilia.assetmonitoring.interfaces.rest.resources.CreateBuildingResource;
/**
 * Builds a CreateBuildingCommand from its REST resource.
 */
public class CreateBuildingCommandFromResourceAssembler {
    public static CreateBuildingCommand toCommandFromResource(CreateBuildingResource resource) {
        return new CreateBuildingCommand(
                resource.name(),
                new BuildingCode(resource.code()),
                resource.address(),
                resource.district(),
                resource.totalUnits());
    }
}