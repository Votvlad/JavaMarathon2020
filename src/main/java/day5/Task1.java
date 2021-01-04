package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setYearOfIssue(1971);
    car.setColorOfCar("white");
    car.setModelOfCar("Dodge Challenger");
    System.out.println("Year Of Issue: " + car.getYearOfIssue());
    System.out.println("Color Of Car: " + car.getColorOfCar());
    System.out.println("Model Of Car: " + car.getModelOfCar());
    }
}
class Car {
    private int YearOfIssue;
    private String ColorOfCar;
    private String ModelOfCar;

    public void setYearOfIssue (int year) {
        YearOfIssue = year;
    }
    public int getYearOfIssue () {
        return YearOfIssue;
    }
    public void setColorOfCar (String color) {
        ColorOfCar = color;
    }
    public String getColorOfCar () {
        return ColorOfCar;
    }
    public void setModelOfCar (String model) {
        ModelOfCar = model;
    }
    public String getModelOfCar () {
        return ModelOfCar;
    }
}
