/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.estrutura.dados.atividade1;

import br.edu.ifsc.estrutura.dados.util.ArrayUtils;
import java.util.Scanner;

/**
 *
 * @author renato
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] m = new double[2][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("Entre com o valor (%s,%s)\n", i, j);
                m[i][j] = s.nextDouble();
            }
        }
        System.out.println("Matriz digitada foi");
        ArrayUtils.printMatriz(m);
    }
}
