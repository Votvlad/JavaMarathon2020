package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike bike = new Motorbike(2013, "silver", "Harley-Davidson");
    System.out.println("Year Of Issue: " + bike.getYear());
    System.out.println("Color: " + bike.getColor());
    System.out.println("Model: " + bike.getModel());
    }
}
class Motorbike {
    private  int year;
    private  String color;
    private  String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
