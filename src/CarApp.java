import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many cars will you be entering information for?: ");
        int userCars = scan.nextInt();
        scan.nextLine();

        Car[] carData = new Car[userCars];
        //ArrayList<Car> carData = new ArrayList<>();

        for (int i = 0; i < userCars; i++) {

            System.out.println("Enter car type:");
            //car.setCarType(scan.nextLine());
            String userCarType = scan.nextLine();

            System.out.println("Enter car year:");
            // car.setYear(scan.nextInt());
            int userCarYear = scan.nextInt();
            scan.nextLine();

            Car car = new Car(userCarType, userCarYear);

            car.setCarType(userCarType);
            car.setYear(userCarYear);
            carData[i] = car;

            //carData.add(car); IF USING ARRAYLIST
        }

        System.out.println("Here's the info you entered: ");

        System.out.println("Vehicle Type:" + "\t" + "Vehicle Year:");
//
//        for (int i = 0; i < carData.length; i++) { NONE OF THESE WORK.....
//            System.out.println(i);
//            System.out.println(carData.toString());
//            System.out.println(carData[i]);
//            System.out.println(carData[i].toString());
//            System.out.println(Arrays.toString(carData));
//        }

        for (Car carX : carData) {
            System.out.println(carX.getCarType() + "\t" + carX.getYear() + " " + "\t");
//            System.out.println(carX.toString()); //NONE OF THESE EITHER
//            System.out.println(carX);
        }

    }


}
