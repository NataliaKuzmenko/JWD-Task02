package by.epamtc.factoryAppliance.entity;

import java.util.List;

public class Appliance {

    public Appliance create(List<String> parsedData) {
        Appliance appliance;
        String applianceType = parsedData.get(0);
        if (applianceType.equalsIgnoreCase("Oven")) {
            appliance = Oven.createOven(parsedData);
        } else if (applianceType.equalsIgnoreCase("Laptop")) {
            appliance = Laptop.createLaptop(parsedData);
        } else if (applianceType.equalsIgnoreCase("Refrigerator")) {
            appliance = Refrigerator.createRefrigerator(parsedData);
        } else if (applianceType.equalsIgnoreCase("Speakers")) {
            appliance = Speakers.createSpeakers(parsedData);
        } else if (applianceType.equalsIgnoreCase("TabletPC")) {
            appliance = TabletPC.createTabletPC(parsedData);
        } else if(applianceType.equalsIgnoreCase("VacuumCleaner")) {
            appliance = VacuumCleaner.createVacuumCleaner(parsedData);
        }else{
            appliance = null;
        }
        return appliance;
    }
}
