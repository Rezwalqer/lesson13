package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка автобуса: " + brand + ", модель: " + model + ", цвет: " + color +", год производства: " + year + ", страна производства: " + country + ", максимальная скорость: " + maxSpeed;
    }
}
