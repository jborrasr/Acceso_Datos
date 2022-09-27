package Comparadores;

public class Persona implements Comparable<Persona> {

    int edad;

    String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "org.iesch.ad.modelo.Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    //devolver 0 si son iguales
    //devolver 1 si el this > que el argumento
    //devolver un -1 si el argumento es > this

    @Override
    public int compareTo(Persona o) {
       // if (this.edad == o.edad) return 0;
       // else if (this.edad > o.edad) return 1;
       // else return -1;

        return Integer.compare(this.edad, o.edad);
    }
}
