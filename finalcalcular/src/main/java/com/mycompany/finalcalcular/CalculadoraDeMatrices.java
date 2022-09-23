package com.mycompany.finalcalcular;

import javax.swing.JOptionPane;

public class CalculadoraDeMatrices {

    public void suma(double[][] matrizA, double[][] matrizB, int tam) {
        double mR[][] = new double[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mR[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        String resultadoF = " ";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                resultadoF += mR[i][j] + "  ";
            }
            resultadoF += " \n ";
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: \n" + resultadoF);
    }

    public void resta(double[][] matrizA, double[][] matrizB, int tam) {
        double mR[][] = new double[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mR[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        String resultadoF = " ";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                resultadoF += mR[i][j] + "  ";
            }
            resultadoF += " \n ";
        }
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: \n" + resultadoF);
    }

    public void traza(double[][] matrizA, double[][] matrizB, int tam) {
        int trA = 0, trB = 0;
        for (int i = 0; i < matrizA.length; i++) {
            trA += matrizA[i][i];
        }
        for (int i = 0; i < matrizB.length; i++) {
            trB += matrizB[i][i];
        }
        JOptionPane.showMessageDialog(null, "La traza de la matriz A es: \n" + trA + "\n La traza de la matriz B es: \n" + trB);
    }

    public void determinante(double[][] matrizA, double[][] matrizB, int tam) {
        JOptionPane.showMessageDialog(null, "Determinante");
    }
}
