import java.util.ArrayList;
import java.util.Collections;

public class Cars {
    private ArrayList<Car> cars;
    public Cars(){
        this.cars = new ArrayList<Car>();
    }
    public void addCar( Car car ){
        this.cars.add( car );
    }
    public void deleteCar( Car car ){
        this.cars.remove( car );
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
    public void showLessPrice(){
        Collections.sort( this.getCars() );
        for ( Car car : cars ){
            System.out.println(
                    "Marca: " + car.getMarca() +
                            "\nModelo: " + car.getModelo() +
                            "\nAno: " + car.getAnio() +
                            "\nPrecio: " + car.getPrecio() +
                            "********\n"

            );
        }
    }

}
