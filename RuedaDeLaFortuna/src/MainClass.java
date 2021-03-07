import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        String opc;
        Random Index = new Random();
        Scanner e = new Scanner(System.in);
        String[] RuedaF = new String[5];
        RuedaF[0]="Carro";
        RuedaF[1]="Moto";
        RuedaF[2]="Casa";
        RuedaF[3]="1M De Dolares";
        RuedaF[4]="Viaje a Dubaí";
        try{
            do{
                System.out.println(" \nBIENVENIDO A MI PROGRAMA DE RUEDA DE LA FORTUNA!! \n \nQUE DESEAS HACER? \n \n1. GIRAR RUEDA DE LA FORTUNA \n2. SALIR DEL PROGRAMA");
                opc = e.nextLine();
                if(opc.equals("1")) {
                    System.out.println(" \n \nFelicidades!! Ganaste Un: "+RuedaF[Alea(Index)]);
                    e.nextLine();
                }else if(opc.equals("2")){
                    System.out.println(" \n \nGRACIAS POR UTILIZAR MI PROGRAMA!! ESPERO HAY SIDO DE TU AGRADO ;)");
                    e.nextLine();
                }else{
                    System.out.println(" \n \nLA OPCION INGRESADA NO EXISTE, INGRESA UNA OPCION VALIDA :)");
                    e.nextLine();
                }
            }while(opc.equals("2")==false);
        }catch(Exception er){
            System.out.println(er.getMessage());
            e.nextLine();
        }
    }
    public static int Alea(Random x){
        int r = x.nextInt(5);
        return r;
    }
}