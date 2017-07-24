public class UsedCar extends Car{

    public UsedCar(String carType, int year, int mileage) {
        super(carType, year);
        //this.mileage = mileage; DON'T THINK I NEED THIS?
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    private int mileage;



}
