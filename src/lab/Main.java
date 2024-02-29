package lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Cual es su nombre? ");
        String nombre = lectura.nextLine();
        
        System.out.println("\ncual es su edad? ");
        int edad = lectura.nextInt();
        lectura.nextLine(); 
        
        System.out.println("\nDigite su estatura(cm)");
        int estatura = lectura.nextInt();
        lectura.nextLine(); 
        
        System.out.println("\nEstado civil? ");
        String estadoCivil = lectura.nextLine();

        System.out.println("\nescriba su domicio: ");
        String domicilio = lectura.nextLine();

        Persona pers1 = new Persona(nombre, edad, estadoCivil, domicilio, estatura);

       System.out.println("Hola " + pers1.getNombre() + ", tu edad es de " + pers1.getEdad() + "\n" +
                      " tu estatura es de: " + pers1.getEstatura() + " cm\n" +
                      " tu estado civil es: " + pers1.getEstadoCivil() + "\n" +
                     " tu domicilio es: " + pers1.getDomicilio() + "\n");
       
                  


        System.out.println("\nComeras el dia de hoy?");
        String opcion = lectura.nextLine();
        if ("si".equalsIgnoreCase(opcion)) {
            System.out.println("Que comeras hoy?");
            String comida = lectura.nextLine();
            pers1.Comer(comida);
        } else {
            System.out.println("De acuerdo, no tienes hambre al parecer.");
        }

        System.out.println("\nTe tomaras una ducha el dia de hoy?");
        String opcion2 = lectura.nextLine();
        if ("si".equalsIgnoreCase(opcion2)) {
            System.out.println("Con que jabon?");
            String jabon = lectura.nextLine();
            System.out.println("Con agua fria o caliente?");
            String tempAgua = lectura.nextLine();
            pers1.tomarshowerPublico(jabon, tempAgua);
        } else {
            System.out.println("De acuerdo, no te daras una ducha hoy.");
        }
        
        System.out.println("\nDormiras el dia de hoy?");
        String opcion3 = lectura.nextLine();
        if ("si".equalsIgnoreCase(opcion3)) {
            System.out.println("Cuantas horas?");
            int horas = lectura.nextInt();
            
            pers1.Dormir(horas);
        } else {
            System.out.println("De acuerdo, no dormiras esta noche.");
        }
    }
    }

