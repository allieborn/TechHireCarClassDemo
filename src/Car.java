
public class Car {

    private String carType;
    private int year;


    public Car (String carType, int year){
        carType = "";
        year = 1800;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
