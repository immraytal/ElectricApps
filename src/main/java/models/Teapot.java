package models;

public class Teapot extends ElectricApp {
    private float volume;

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public Teapot(String modelName, double capacity, Boolean isConnect, float volume) {
        super(modelName, capacity, isConnect);
        this.volume = volume;
    }

    public Teapot() {
        super();
        volume = 0.0f;
    }

    public Teapot(String modelName, double capacity, Boolean isConnect) {
        super(modelName, capacity, isConnect);
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume=" + volume +
                '}';
    }


}
