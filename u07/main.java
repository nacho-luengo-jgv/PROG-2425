package U07_A0X;
import java.util.Scanner;

public class main{
    
    public static void main(String[]args){
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese el dni: ");
        String dni=sc.nextLine();
        CuentaCorriente nuevo=new CuentaCorriente(nombre,dni);*/
        CuentaCorriente c=new CuentaCorriente("54980127f",20.00);
        CuentaCorriente cta=new CuentaCorriente("54980127d","Ignacio Joel Luengo",50.00);
        System.out.println("Sobrecargado 1: ");
        c.muestro();
        System.out.println("Sobrecargado 2: ");
        cta.muestro();
      /* nuevo.muestro();
        nuevo.ingreso(200.0);
        nuevo.muestro();
        System.out.println("Ingrese la cantidad de dinero a sacar: ");
        double saco=sc.nextDouble();
        boolean retiro=nuevo.sacarDinero(saco);
        System.out.println("Pude retirar: "+retiro);*/
        
        
    }
}
