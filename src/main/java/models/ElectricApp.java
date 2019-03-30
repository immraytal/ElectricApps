package models;

public abstract class ElectricApp {
    private String modelName;
    private double capacity;
    private Boolean plugged;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Boolean isPlugged() {
        return plugged;
    }

    public void setPlugged(Boolean plugged) {
        this.plugged = plugged;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ElectricApp() {
        modelName = "Unknown";
        capacity = 0.0;
        plugged = false;
    }

    public ElectricApp(String modelName, double capacity, Boolean plugged) {
        this.modelName = modelName;
        this.capacity = capacity;
        this.plugged = plugged;
    }
}
