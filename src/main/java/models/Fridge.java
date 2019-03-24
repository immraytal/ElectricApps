package models;

public class Fridge extends ElectricApp {
    private float refrigeratorVolume;
    private float freezerVolume;

    public float getRefrigeratorVolume() {
        return refrigeratorVolume;
    }

    public void setRefrigeratorVolume(float refrigeratorVolume) {
        this.refrigeratorVolume = refrigeratorVolume;
    }

    public float getFreezerVolume() {
        return freezerVolume;
    }

    public void setFreezerVolume(float freezerVolume) {
        this.freezerVolume = freezerVolume;
    }

    public Fridge(String modelName, double capacity, Boolean isConnect, float refrigeratorVolume, float freezerVolume) {
        super(modelName, capacity, isConnect);
        this.refrigeratorVolume = refrigeratorVolume;
        this.freezerVolume = freezerVolume;
    }

    public Fridge() {
        super();
        refrigeratorVolume = 0.0f;
        freezerVolume = 0.0f;
    }

    public Fridge(String modelName, double capacity, Boolean isConnect) {
        super(modelName, capacity, isConnect);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "refrigeratorVolume=" + refrigeratorVolume +
                ", freezerVolume=" + freezerVolume +
                '}';
    }

    @Override
    public String getClassName() {
        return "Fridge";
    }
}
