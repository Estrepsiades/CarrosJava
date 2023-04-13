import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cars garaje = new Cars();
        Scanner input = new Scanner( System.in );
        int agregarOpt;
        System.out.println("Hello world!");
        System.out.println("Cuantos carros quieres agregar papi");
        agregarOpt = input.nextInt();
        for (int i = 0; i < agregarOpt ; i++) {
            newCar( input, garaje );
        }

        garaje.showLessPrice();
    }
    public static void newCar( Scanner input, Cars garaje ){
        String marca, modelo;
        int anio, precio;
        System.out.println("Agrega un carro");
        System.out.println("Ingresa Marca");
        marca = input.next();
        System.out.println("Ingresa Modelo");
        modelo = input.nextLine();
        System.out.println("Ingresa Ano");
        anio = input.nextInt();
        System.out.println("Ingresa Precio");
        precio = input.nextInt();
        Car carro = new Car( marca, modelo, anio, precio );
        garaje.addCar( carro );
    }
}