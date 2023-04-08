import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a: Para homens: (72.7*h) - 58
//b: Para mulheres: (62.1*h) - 44.7

public class exercicio13 {
    public static void main(String[] args) {

        double altura,pesoidealh,pesoidealm;

        Scanner teclado = new Scanner(System.in);
        System.out.println("escreva sua altura");
        altura = teclado.nextDouble();
        teclado.close();

        pesoidealh = (72.7 * altura) - 58;
        pesoidealm = (62.1 * altura) - 44.7; 

        System.out.println("peso ideal homem ");
        System.out.println(pesoidealh);

        System.out.println("peso ideal mulher ");
        System.out.println(pesoidealm);

        }       
        
    }