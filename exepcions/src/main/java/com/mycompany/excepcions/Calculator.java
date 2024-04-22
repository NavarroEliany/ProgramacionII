
package com.mycompany.excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {

    public Calculator() {
    }
    public int division (int a, int b){
        /*validacion que evita la excepcion
        if(b <= 0) {
            System.out.println("Operacion no permitida" );
            return -1;
        }*/
        boolean repeat;
        int res=0;
        Scanner scanner =  new Scanner (System.in);
        do{
            repeat = false;
        
        try{
            res =a/b;
        }catch(ArithmeticException  e){
            System.out.println("Operacion no válida");
            System.out.println("Ingrese un nuevo valor  ");
            b= scanner.nextInt();
            repeat = true;
      
    
        }catch( InputMismatchException e){
            System.out.println("Tipo de dato no valido");
            System.out.println("Ingrese un nuevo valor  ");
            b= scanner.nextInt();
            repeat = true;
        }
                
    } while (repeat);
        return res;
}
}
