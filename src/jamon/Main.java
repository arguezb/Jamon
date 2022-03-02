/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 * Clase main del programa, que define un objeto JamonRodriguezBustosAlberto2122
 * con unos parametros y realiza acciones de comprar y vender
 *
 * @author Rodriguez Bustos Alberto
 * @version 1.0
 */
public class Main {

    /**
     * Método de la clase principal
     * @param args argumento de linea de comando
     */
    public static void main(String[] args) {
        JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122;
        int stockActual;

        miJamonRodriguezBustosAlberto2122 = new JamonRodriguezBustosAlberto2122("5Jotas", 580, 100);

        venderJamRodriguezBustosAlberto2022(miJamonRodriguezBustosAlberto2122);
        comparJamRodriguezBustosAlberto2022(miJamonRodriguezBustosAlberto2122);

        stockActual = miJamonRodriguezBustosAlberto2122.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    /**
     * Método comparJamRodriguezBustosAlberto2122 que contiene como parametro la
     * instancia del constructor y que comprará una cantidad de jamones
     * determinada Tambien contiene una excepción si intentamos compra una
     * cantidad negativa de jamones
     *
     * @param miJamonRodriguezBustosAlberto2122 intancia de clase
     */
    private static void comparJamRodriguezBustosAlberto2022(JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122) {
        try {
            System.out.println("Compra de Jamones");
            miJamonRodriguezBustosAlberto2122.comprar(50);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    /**
     * Método venderJamRodriguezBustosAlberto2122 que contiene como parametro la
     * instancia del constructor y que venderá una cantidad de jamones
     * determinada Tambien contiene una excepción si nos pasamos del stock
     * instanciado o intentamos comprar una cantidad negativa de jamones
     *
     * @param miJamonRodriguezBustosAlberto2122 intancia de clase
     */
    private static void venderJamRodriguezBustosAlberto2022(JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122) {
        try {
            System.out.println("Venta de Jamones");
            miJamonRodriguezBustosAlberto2122.vender(80, "Espana");
        } catch (Exception e) {
            System.out.print("Fallo al vender " + e);
        }
    }
}
