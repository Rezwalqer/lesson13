package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carType;
    private int id;
    private final int seatsCount;
    private String tires;
    private Insurance insurance;




    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;


        public Key(boolean remoteEngineStart, boolean keylessEntry) {  // Вложенный класс  "Ключ"
            this.remoteEngineStart = remoteEngineStart;  // Удаленный запуск двигателся
            this.keylessEntry = keylessEntry;  // Бесключевой доступ
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String carType, int id, int seatsCount, String tires) {
        if (brand == null || brand.isEmpty() ) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() ) {
            this.model = "default";
        } else {
            this.model = brand;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if  (color == null || color.isEmpty()) {
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
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (carType == null || carType.isEmpty()) {
            this.carType = "default";
        } else {
            this.carType = carType;
        }
        if (id < 0) {
            this.id = Math.abs(id);
        } else {
            this.id = id;
        }
        if (seatsCount < 0) {
            this.seatsCount = Math.abs(seatsCount);
        } else if (seatsCount == 0) {
            this.seatsCount = 4;
        } else {
            this.seatsCount = seatsCount;
        }
        if ( tires == null || tires.isEmpty()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }

    }

    public static class Insurance {
        private LocalDate termOfInsurance;   // Срок действия страховки. Год, в который была оформлена страховка
        private int insuranceValue;    // Стоимость страховки
        private String insuranceNumber;

        public Insurance(LocalDate termOfInsurance, int insuranceValue, String insuranceNumber) {
            if (termOfInsurance == null) {
                this.termOfInsurance = LocalDate.of(2022, 12, 1);
            } else {
                this.termOfInsurance = termOfInsurance;
            }
            if (insuranceValue < 0) {
                this.insuranceValue = Math.abs(insuranceValue);
            } else {
                this.insuranceValue = insuranceValue;
            }
            if (insuranceNumber == null || insuranceNumber.isEmpty() || insuranceNumber.isBlank()) {
                this.insuranceNumber = "default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }
        public void checkInsurance() {
            if (termOfInsurance.isBefore(LocalDate.now())) {
                System.out.println("Срок действия страховки истек! Срочно нужно оформить новую!");
            }
        }

        public void checkInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный! Номер должен содержать 9 знаков");
            }
        }

        @Override
        public String toString() {
            return "Страховка " +
                    "Срок действия страховки: " + termOfInsurance +
                    ", стоимость страховки: " + insuranceValue +
                    ", номер страховки: '" + insuranceNumber;
        }
    }


    @Override
    public String toString() {
        return "Марка автомобиля: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год производства: " + year + ", страна производства: " + country + ". Коробка передач: " + transmission + ", тип кузова: " + carType
                + ", ID: " + id + ", количество сидений: " + seatsCount + ", тип резины: " + tires + ". " + getInsurance();
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


    public String getCarType() {
        return carType;
    }


    public int getSeatsCount() {
        return seatsCount;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTires() {
        return tires;
    }

    public Insurance getInsurance() {
        return insurance;
    }


    public String changeTires(int month) {      // Метод "Сменить шины".
        if (month == 1 || month == 2 || month == 12 || month == 11) {
            this.tires = "Зимняя";
        } else {
            this.tires = "Летняя";
        }
        return this.tires;
    }


}
