package cuentas;

//Clase que representa una cuenta bancaria.
public class CCuenta {

    //Atributos privados para proteger la información de la cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor para crear una cuenta bancaria con valores iniciales.
     *
     * @param nombre Nombre del titular de la cuenta.
     * @param cuenta Número de cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoInteres Tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;

    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta bancaria.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo disponible en la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return Tipo de interés aplicado.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interés de la cuenta.
     *
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Permite ingresar dinero en la cuenta
     *
     * @param Cantidad cantidad a ingresar
     * @throws Exception , si la cantidad e snegativa
     *
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Permite retirar dinero de la cuenta.
     *
     * @param Cantidad cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o mayor que el saldo
     * disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (cantidad > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        saldo -= cantidad;
    }

    /**
     * Devuelve el saldo actual
     *
     * @return Saldo disponible
     *
     */
    public double estado() {
        return saldo;
    }
}
