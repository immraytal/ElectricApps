package models;

public class Tv extends ElectricApp {
    private int channels;
    private int fps;

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public int getFps() {
        return fps;
    }

    public Tv(String modelName, double capacity, Boolean isConnect) {
        super(modelName, capacity, isConnect);
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public Tv(String modelName, double capacity, Boolean isConnect, int channels, int fps) {
        super(modelName, capacity, isConnect);
        this.channels = channels;
        this.fps = fps;
    }

    public Tv() {
        super();
        channels = 0;
        fps = 0;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "channels=" + channels +
                ", fps=" + fps +
                '}';
    }
}
