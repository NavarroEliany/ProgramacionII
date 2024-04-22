package com.mycompany.excepcions;

public class Excepcions {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int res = calculator.division(2, 0);

        /* try{
          int res =calculator.division(4, 0);
          System.out.println(res);
    } catch (Exception excepction) {
        System.out.println("Ha ocurrido un problema " );
        System.out.println( excepction);
       // int res =2/0;
    }finally{
        System.out.println("Se imprime");
    }
        System.out.println("Fuera del bloque try ");
         */
       /* try {
            int[] numbers = new int[3];
            numbers[5] = 2/2;

        } catch (ArithmeticException e) {
            System.out.println("Operación no permitida");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición de array no válida");

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error ");
        }*/
    }

}
