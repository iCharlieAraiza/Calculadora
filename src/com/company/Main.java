package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean s = true;
        String num, op;


        Calculadora Cal = new Calculadora();
        Scanner Input = new Scanner( System.in );

        System.out.println("Instrucciones:\nPara salir del programa, solo debes poner la letra 's' en el campo de 'Operador' ");
        System.out.println("*************************************************************************************************");

        System.out.print("Número: ");
        num = Input.nextLine();

        Cal.setNumero( Double.parseDouble(num) );

        do{

            do{
                System.out.print("Operador (+, -, *, /): ");
                op = Input.nextLine();
                if( !Calculadora.checkOp(op) ){
                    System.out.println("Has agregado una operación no válida");
                }
            }while( !Calculadora.checkOp(op) );

            if( op.equals("s")){
                s=false;
            }else{
                System.out.print("Número: ");
                num = Input.nextLine();
                operaciones(Cal, Double.parseDouble(num), op);
            }

        }while(s);
    }

    static public void operaciones(Calculadora Cal, double num, String op){
        switch(op.charAt(0)){
            case '+':
                Cal.suma(num);
                break;
            case '-':
                Cal.resta(num);
                break;
            case '/':
                Cal.division(num);
                break;
            case '*':
                Cal.multiplicacion(num);
                break;
        }
        System.out.println( Cal.getNumero() );
    }

}
