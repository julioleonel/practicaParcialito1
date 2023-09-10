package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se proporcionaron argumentos");
            return;
        }

            System.out.println("Ingreso los siguientes argumentos: ");
            for (String argumento : args){
                System.out.println(argumento + " ");
            }

        int cantidad = args.length;

        System.out.println("La frase tiene: " + cantidad + " palabras");

    }
}


