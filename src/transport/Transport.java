package transport;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected String color;
    protected final int year;
    protected final String country;
    protected int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (maxSpeed < 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }

    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
