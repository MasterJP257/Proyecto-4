package angrybird;

public class Pajaro {

    String color;
    String forma;
    String nombre;

    public Pajaro(String color, String forma, String nombre) {
        this.color = color;
        this.forma = forma;
        this.nombre = nombre;
    }
    
    public void soy(){
        System.out.println("Hola me llamo: "+nombre);
    }
    
    public void Des(){
        System.out.println("Soy de color: "+color+" y de forma: "+forma+".\n");
    }

    public String getColor() {
        return color;
    }

    public String getForma() {
        return forma;
    }

}