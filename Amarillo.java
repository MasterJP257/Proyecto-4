package angrybird;

public class Amarillo extends Pajaro{

    public Amarillo(String color, String forma, String nombre) {
        super(color, forma, nombre);
    }
    
    public void Tirarse() {
        System.out.println("Hola soy el Amarrillo, me tiro y me devuelvo =>.");
    }
}