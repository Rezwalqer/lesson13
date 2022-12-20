public class Main {
    public static void main(String[] args) {


        // Задача №1:


//        Car lada = new Car();
//        lada.brand = "Lada";
//        lada.model = "Granta";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.year = 2015;
//        lada.country = "Россия";
//
//        Car audi = new Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.year = 2020;
//        audi.country = "Германия";
//
//        Car bmw = new Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный";
//        bmw.year = 2021;
//        bmw.country = "Германия";
//
//        Car kia = new Car();
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.year = 2018;
//        kia.country = "Южная Корея";
//
//        Car hyundai = new Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.year = 2016;
//        hyundai.country = "Южная Корея";

        // Задача №2:

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai ", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada.toString() + "\n" + audi.toString() + "\n" + bmw.toString() + "\n" + kia.toString() + "\n" + hyundai.toString());
    }


}