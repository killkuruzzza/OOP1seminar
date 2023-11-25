public final class HotDrink extends Product{
    private int temperature;
    private int volume;

    public HotDrink(String name, int cost,int volume, int temperature) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }
    public int getVolume() {
        return volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "HotDrink{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";volume=" + volume +
                ";temperature=" + temperature +
                '}';
    }
}
