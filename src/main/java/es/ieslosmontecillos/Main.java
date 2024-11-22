package es.ieslosmontecillos;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("hola.txt");
        System.out.println("INFORMACIÓN SOBRE EL FICHERO:\n" + "==============================");
        System.out.println("Nombre del fichero "+file.getName());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Ruta absoluta: "+file.getAbsolutePath());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede leer: "+file.canRead());
        System.out.println("Tamaño: "+file.getUsableSpace());
        System.out.println("Es un directorio: "+file.isDirectory());
        System.out.println("Es un fichero: "+file.isFile());

    }
}