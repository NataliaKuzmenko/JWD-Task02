package by.epamtc.factoryAppliance.entity;

import java.util.List;
import java.util.Objects;

public class Refrigerator extends Appliance {
    private int powerConsumption;
    private double weight;
    private int freezerCapacity;
    private int overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(int powerConsumption, double weight, int freezerCapacity, int overallCapacity, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                Double.compare(that.weight, weight) == 0 &&
                freezerCapacity == that.freezerCapacity &&
                overallCapacity == that.overallCapacity &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    public static Appliance createRefrigerator(List<String> data) {
        int powerConsumption = Integer.parseInt(data.get(1));
        double weight = Double.parseDouble(data.get(2));
        int freezerCapacity = Integer.parseInt(data.get(3));
        int overallCapacity = Integer.parseInt(data.get(4));
        double height = Double.parseDouble(data.get(5));
        double width = Double.parseDouble(data.get(6));
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }
}
