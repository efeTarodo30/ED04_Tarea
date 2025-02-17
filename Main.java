package cuentas;

public class Main {

    public static void main(String[] args) {
        // Creación de una cuenta con saldo inicial de 2500
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Llamamos a operativa_cuenta con un monto de prueba (por ejemplo, 695)
        operativa_cuenta(cuenta1, 695);
    }

    /**
     * Método que realiza operaciones sobre la cuenta bancaria, como consultar
     * saldo, retirar e ingresar dinero.
     *
     * @param cuenta1 Objeto de tipo CCuenta sobre el cual se realizarán las
     * operaciones.
     * @param cantidad Cantidad a retirar e ingresar en la cuenta.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Intentamos retirar la cantidad especificada
        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        
        // Intentamos ingresar la misma cantidad especificada
        try {
            System.out.println("Ingreso en cuenta...");
            cuenta1.ingresar(cantidad);
            System.out.println("Saldo después del ingreso: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
