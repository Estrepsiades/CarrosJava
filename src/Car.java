public class Car implements Comparable<Car>{
    String modelo, marca;
    int anio, precio;
    public Car(String marca, String modelo, int anio, int precio ){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }
    public int compareTo( Car anotherCar ){
        if ( this.precio < anotherCar.precio ){
            return -1;
        }
        if ( this.precio > anotherCar.precio ){
            return 1;
        }
        return 0;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getPrecio() {
        return precio;
    }
}
