package by.epamtc.factoryAppliance.main;

import by.epamtc.factoryAppliance.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (appliance != null) {
            for (Appliance element : appliance
            ) {
                System.out.println(element);
            }
        }
    }

    // you may add your own code here

}
