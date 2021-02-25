import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        Scanner entrada = new Scanner(System.in);
        int Indicial;
        int Infinal;
        int opc;
        String palabra1;
        String palabra2;
        try{
            do {
                System.out.println(" \nBienvenido A Mi Programa! \n \nQue Deseas Hacer? \n \n1. TamañoCadena \n2. Subcadena \n3. Comparacón Palabras \n4. Comparación Tamaño \n5. SALIR DEL PROGRAMA");
                opc = Integer.parseInt(entrada.nextLine().trim());
                switch (opc) {
                    case 1:
                        System.out.print(" \nBienvenido A Tamaño Cadena! Donde le decimos cuanto mide su String! \n Por Favor Ingrese la Cadena de Texto a Evaluar acontinuación...\n ");
                        palabra1 = entrada.nextLine();
                        funciones.tamañoCadena(palabra1);
                        break;
                    case 2:
                        System.out.println(" \nBienvenido a SubCadena!! \n \nPara empezar... que string usarás como base para sacar substrings?");
                        palabra1 = entrada.nextLine();
                        System.out.println(" \nAhora... cual quieres que sea el indice inicial de tu subString?");
                        Indicial = Integer.parseInt(entrada.nextLine());
                        System.out.println(" \nMuy bien... ahora ingresa el tamaño del cual quieres que sea tu SubString...");
                        Infinal = Integer.parseInt(entrada.nextLine());
                        funciones.subString(palabra1, Indicial, Infinal);
                        break;
                    case 3:
                        System.out.println(" \nBienvenido a ComparaPalabras!! \nVamos ingresa la primer palabra a comparar!!");
                        palabra1 = entrada.nextLine();
                        System.out.println("\nAhora Ingresa la segunda palabra a comparar...");
                        palabra2 = entrada.nextLine();
                        do{
                            System.out.println(" \nDeseas tomar en cuenta las letras mayusculas que pueden haber en tus palabras ingresadas? \n \n1. SI \n2. NO");
                            Infinal = Integer.parseInt(entrada.nextLine());
                            if(Infinal != 1 && Infinal != 2){
                                System.out.println("La opcion ingresada no Existe, Elija una opcion válida");
                            }
                        }while(Infinal != 1 && Infinal != 2);
                        funciones.compapa(palabra1, palabra2, Infinal);
                        break;
                    case 4:
                        System.out.println(" \nBienvenido a ComparaTamaño!! \n \nVamos, Ingresa el primer String a comparar...");
                        palabra1 = entrada.nextLine();
                        System.out.println(" \nIngresa el segundo String a comparar...");
                        palabra2 = entrada.nextLine();
                        do{
                            System.out.println(" \nDeseas tomar en cuenta los espacios en blanco que pueden haber en tus Strings ingresadas? \n \n1. SI \n2. NO");
                            Infinal = Integer.parseInt(entrada.nextLine());
                            if(Infinal != 1 && Infinal != 2){
                                System.out.println("La opcion ingresada no Existe, Elija una opcion válida");
                            }
                        }while(Infinal != 1 && Infinal != 2);
                        funciones.Tamaño(palabra1, palabra2, Infinal);
                        break;
                    case 5:
                        System.out.println(" \nGracias por Utilizar mi Programa! Vuelve Pronto!");
                        entrada.nextLine();
                        break;
                    default:
                        System.out.println("La Opcion Ingresado No Existe, Ingrese una opción valida ;)");
                        entrada.nextLine();
                        break;
                }
            } while (opc != 5);
        }catch(NumberFormatException e){
            System.out.println(" \nLa Opcion Ingresada no es un Numero, Ingrese una Opcion Válida");
        }
    }
}
