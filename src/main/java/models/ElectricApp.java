package models;

public abstract class ElectricApp {
    private String modelName;
    private double capacity;
    private Boolean isConnect;

    public abstract String getClassName();

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Boolean getConnect() {
        return isConnect;
    }

    public void setConnect(Boolean connect) {
        isConnect = connect;
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
        isConnect = false;
    }

    public ElectricApp(String modelName, double capacity, Boolean isConnect) {
        this.modelName = modelName;
        this.capacity = capacity;
        this.isConnect = isConnect;
    }
}
