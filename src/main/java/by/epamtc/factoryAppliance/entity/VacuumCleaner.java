package by.epamtc.factoryAppliance.entity;

import java.util.List;
import java.util.Objects;

public class VacuumCleaner extends Appliance {
    private int powerConsumption;
    private int motorSpeedRegulation;
    private double cleaningWidth;
    private String filterType;
    private String bagType;
    private String wandType;

    public VacuumCleaner() {
    }

    public VacuumCleaner(int powerConsumption, int motorSpeedRegulation, double cleaningWidth, String filterType, String bagType, String wandType) {
        this.powerConsumption = powerConsumption;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                motorSpeedRegulation == that.motorSpeedRegulation &&
                Double.compare(that.cleaningWidth, cleaningWidth) == 0 &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, wandType);
    }

    public static VacuumCleaner createVacuumCleaner(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        int motorSpeedRegulation = Integer.parseInt(data.get(2));
        double cleaningWidth = Double.parseDouble(data.get(3));
        String filterType = data.get(4);
        String bagType = data.get(5);
        String wandType = data.get(6);
        return new VacuumCleaner(powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, wandType);
    }
}
