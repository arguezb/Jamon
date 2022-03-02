/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122;
        int stockActual;
        
        miJamonRodriguezBustosAlberto2122 = new JamonRodriguezBustosAlberto2122("5Jotas",580,100);
        
        venderJamRodriguezBustosAlberto2022(miJamonRodriguezBustosAlberto2122);  
        comparJamRodriguezBustosAlberto2022(miJamonRodriguezBustosAlberto2122);
        
        stockActual = miJamonRodriguezBustosAlberto2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void comparJamRodriguezBustosAlberto2022(JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonRodriguezBustosAlberto2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void venderJamRodriguezBustosAlberto2022(JamonRodriguezBustosAlberto2122 miJamonRodriguezBustosAlberto2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonRodriguezBustosAlberto2122.vender(80, "España");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
