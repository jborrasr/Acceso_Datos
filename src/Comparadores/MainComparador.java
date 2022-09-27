package Comparadores;


import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class MainComparador {
    public static void main(String[] args) {

    Persona p1 = new Persona( 20,"Pepe");
    Persona p2 = new Persona( 18, "Ana");
    Persona p3 = new Persona(25,"Luis");
    Persona p4 = new Persona(30, "Vivas");

        System.out.println("Comparable");
        List<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        //Collection.sort(lista);
        System.out.println("ordenado");
        for (Persona p : lista) System.out.println(p);

        System.out.println("Con programacion funcional, Lambda");

        Comparator<Persona> viejuno = (v1,v2) -> Integer.compare(v1.getEdad(),v2.getEdad());
        Persona p5 = new Persona(85,  "Antonio Jose perez navarro");
        Collections.sort(lista, viejuno);
        for (Persona p : lista) System.out.println(p);
        // lista.stream().forEach(System.out::println;

        System.out.println("Lista");

        System.out.println("Usando interfaz Comparator");
        PersonaNombreComparator pComparator = new PersonaNombreComparator();
        Collections.sort(lista, pComparator);
        for (Persona p : lista) System.out.println(p);

        System.out.println("lista");

        Instrumento i1 = new Instrumento("cuerda", "guitarra", 45);
        Instrumento i2 = new Instrumento("Percusion", "bateria", 96);
        Instrumento i3 = new Instrumento("cuerda", "guitarra", 45);// es igual a i1


        List<Instrumento> array = new ArrayList<>();
        array.add(i1);
        array.add(i2);
        array.add(i3);

        array.forEach(System.out::println);

        System.out.println("TreeSet");
        TreeSet<Instrumento> treeset = new TreeSet<>();
        treeset.add(i1);
        treeset.add(i2);
        treeset.add(i3);
        treeset.forEach(System.out::println);//No repetidos

        System.out.println("TreeMap");

        TreeMap<Integer, Instrumento> map = new TreeMap<>();
        map.put(1,i1);
        map.put(2,i2);
        map.put(3,i3);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));







    }
}
