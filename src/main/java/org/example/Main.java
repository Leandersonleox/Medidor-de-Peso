package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu peso: ");
                double peso = sc.nextDouble();
                System.out.println("Digite sua altura: ");
                double altura = sc.nextDouble();
                double imc = peso/(altura*altura);
                System.out.printf("IMC: %.2f\n",imc);


                if (imc<18.5){
                    System.out.println(nome+", você está ABAIXO DO PESO!!!");
                } else if (imc>18.5 && imc<=24.9) {
                    System.out.println(nome+ ", você está no PESO IDEAL!!!");
                } else if (imc>24.9 && imc<=29.9) {
                    System.out.println(nome+", você está LEVEMENTE ACIMA DO PESO!!!");
                } else if (imc>29.9 && imc<=34.9) {
                    System.out.println(nome+", você está com OBESIDADE GRAU 1!!!");
                } else if (imc>34.9 && imc<=39.9) {
                    System.out.println(nome+", você está com OBESIDADE GRAU 2(SEVERA)!!!");
                }else{
                    System.out.println(nome+", você está com OBESIDADE GRAU 3(MORBIDA)!!!");
                }
            }
        }