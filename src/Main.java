import transport.Car;
import transport.Car.Insurance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




//        transport.Car lada = new transport.Car();
//        lada.brand = "Lada";
//        lada.model = "Granta";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.year = 2015;
//        lada.country = "Россия";
//
//        transport.Car audi = new transport.Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.year = 2020;
//        audi.country = "Германия";
//
//        transport.Car bmw = new transport.Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный";
//        bmw.year = 2021;
//        bmw.country = "Германия";
//
//        transport.Car kia = new transport.Car();
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.year = 2018;
//        kia.country = "Южная Корея";
//
//        transport.Car hyundai = new transport.Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.year = 2016;
//        hyundai.country = "Южная Корея";


        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "Автомат", "Купе", 123, 4, "Летняя");
        Car.Insurance ladaIns = new Car.Insurance(LocalDate.of(2022, 12, 30), 10_000, "123456789");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "Автомат", "Купе", 234, 4, "Летняя");
        Car.Insurance audiIns = new Car.Insurance(LocalDate.of(2023, 12, 30), 15_000, "123456745");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "Автомат", "Купе", 456, 4, "Летняя");
        Car.Insurance bmwIns = new Car.Insurance(LocalDate.of(2021, 12, 30), 20_000, "123456456");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "Автомат", "Купе", 457, 4, "Летняя");
        Car.Insurance kiaIns = new Car.Insurance(LocalDate.of(2023, 10, 30), 25_000, "12345757");
        Car hyundai = new Car("Hyundai ", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "Автомат", "Купе", 534, 4, "Летняя");
        Car.Insurance hyundaiIns = new Car.Insurance(LocalDate.of(2022, 12, 30), 30_000, "153456789");

        hyundai.changeTires(1); // Применяем метод для смены резины
        audi.changeTires(11);


        System.out.println(lada.toString() + "\n" + audi.toString() + "\n" + bmw.toString() + "\n" + kia.toString() + "\n" + hyundai.toString());
        kiaIns.checkInsuranceNumber(); // Проверка номера страховки;
        bmwIns.checkInsurance(); // Проверка срока годности страховки;


    }


}