/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 * Clase publica JamonRodriguezBustosAlberto2122
 * @author Rodriguez Bustos Alberto
 * @version 1.0
 */
public class JamonRodriguezBustosAlberto2122 {

    /**
     * Método getter que devuelve la categoría del jamón
     * 
     * @return devuelve la categoria del jamón
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método setter que asigna la categoría del jamón
     * 
     * @param categoria asigna la categoría del jamón
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método getter que devuelve el precio del jamón
     * 
     * @return devuelve el precio del jamón
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Métod setter que asigna el precio del jamón
     * 
     * @param precio asigna el precio del jamón
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método getter que devuelve los meses de curación
     * 
     * @return devuelve los meses de curación
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Método setter que asigna los meses de curación
     * 
     * @param mesesCuracion asigna los meses de curación
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Método getter que devuelve stock
     * @return devuelve stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * metodo setter que asigna un stock
     *
     * @param stock indica stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /**
     * Constructor por defecto sin parametros
     */
    public JamonRodriguezBustosAlberto2122() {
    }

    /**
     * Constructor con tres parámetros para iniciar todas las propiedades de la
     * clase jamon
     *
     * @param cat categoria del jamón
     * @param precio precio del jamón
     * @param stock cantidad de productos almacenados
     */
    public JamonRodriguezBustosAlberto2122(String cat, double precio, int stock) {
        this.categoria = cat;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método para asignar la categoría del jamón
     *
     * @param cat asigna categoria
     */
    public void asignarCategoria(String cat) {
        setCategoria(cat);
    }

    /**
     * Método que me devuelve la categoría del jamón
     *
     * @return devuelve categoria
     */
    public String obtenerCategoria() {
        return getCategoria();
    }

    /**
     * Método que me devuelve el stock de jamones disponible en cada momento
     *
     * @return devuelve el stock
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método para comprar jamones Modifica el stock Este método va a ser
     * probado con Junit
     *
     * @param cantidad de jamones que se van a comprar
     * @throws Exception Cuando se intenta comprar un numero negativo de jamones
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de jamones");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender jamones Modifica el stock Este método va a ser
     * probado con Junit
     *
     * @param cantidad the value of cantidad
     * @param paisRodriguezBustosAlberto2122 the value of paisRodriguezBustosAlberto2122
     * @throws Exception
     */
    public void vender(int cantidad, java.lang.String paisRodriguezBustosAlberto2122) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de jamones");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No  hay suficientes jamones para vender");
        }
        setStock(getStock() - cantidad);
    }
}
