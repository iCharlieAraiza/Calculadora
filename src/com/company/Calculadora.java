package com.company;
import java.util.Scanner;

public class Calculadora {
    double numero;

    public Calculadora(){
        numero = 0;
    }

    public void setNumero(double numero){
        this.numero = numero;
    }

    public double getNumero(){
        return numero;
    }

    public double suma( double n){
        return this.numero = numero + n;
    }

    public double resta (double n){
        return this.numero = numero - n;
    }

    public double multiplicacion(double n){
        return this.numero = numero * n;
    }

    public double division(double n){
        Scanner Input = new Scanner( System.in );
        if(n==0){
            do{
                //scannear numero
                System.out.println("¡Ups! No se puede dividir entre 0. Agrega otro valor");
                System.out.print("Número: ");
                n = Double.parseDouble( Input.nextLine() );

            }while(n==0);
        }
        return this.numero = numero / n;
    }

    static public boolean checkOp(String op){
        return ( op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("s")  ) ? true : false;
    }

}
