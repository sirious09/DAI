/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.pkg2;

import java.util.Scanner;

/**
 *
 * @author João
 */
// PROGRAMA QUE LÊ 7 NUMEROS DO UTILIZ. E IMPRIME MAIOR
public class TP12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int numero = 0;
        for (int i = 0; i < 7; i++) {
            numero = input.nextInt();
            if (numero > max) {
                max = numero;

            }

        }
        System.out.println("O maior numero introduzido é: " + max);
    }

}
