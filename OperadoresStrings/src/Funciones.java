import java.util.Scanner;

public class Funciones {
    Scanner Espera  = new Scanner(System.in);
    public void tamañoCadena(String x){
        int t = x.length();
        System.out.println(" \nEl Tamaño de La Cadena Ingresada es: "+t);
        Espera.nextLine();
    }
    public void subString(String p, int x, int y){
        int t = p.length();
        if (x+y > t){
            System.out.println(" \nLos indices declarados exceden el tamaño del String principal ingresado :c \nIndices permitidos del String Principal: (0 - "+(t-1)+") \nIndicen Requeridos : ("+x+","+(x+y)+")");
            Espera.nextLine();
        }
        else{
            System.out.println(" \nEl SubString Generado es: "+p.substring(x,x+y));
            Espera.nextLine();
        }
    }
    public void compapa(String a, String b, int x){
        if(x==1){
            if(a==b){
                System.out.println("Las Palabras Ingresadas son Iguales !!");
                Espera.nextLine();
            }
            else{
                System.out.println("Las palabras ingresadas NO son Iguales !!");
                Espera.nextLine();
            }
        }else{
            if(a.toUpperCase() == b.toUpperCase()){
                System.out.println("Las Palabras Ingresadas son Iguales !!");
                Espera.nextLine();
            }
            else{
                System.out.println("Las palabras ingresadas NO son Iguales !!");
                Espera.nextLine();
            }
        }
    }
    public void Tamaño(String a, String b, int x){
        if(x==1){
            if(a==b){
                System.out.println("Los Strings Ingresadas son Iguales !!");
                Espera.nextLine();
            }
            else{
                System.out.println("Los Strings ingresadas NO son Iguales !!");
                Espera.nextLine();
            }
        }else {
            if (a.trim() == b.trim()) {
                System.out.println("Los Strings Ingresadas son Iguales !!");
                Espera.nextLine();
            } else {
                System.out.println("Los Strings ingresadas NO son Iguales !!");
                Espera.nextLine();
            }
        }
    }
}