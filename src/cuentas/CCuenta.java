package cuentas;
/**
 * Clase que define una cuenta del banco
 * @author sergio
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
    * Constructor vacío para la clase CCuenta
    */
    public CCuenta()
    {
    }

    /**
    * Constructor con todos los argumentos para la clase CCuenta
    * @param nom Nombre del dueño de la cuenta
    * @param cue Número de la cuenta
    * @param sal Saldo actual
    * @param tipo Tipo de cuenta
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para saber el estado de la cuenta.
     * @return getSaldo() devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método utilizado para ingresar una cantidad determinada en la cuenta.
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método utilizado para retirar una cantidad determinada de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad a retirar es negativa o superior al saldo actual.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
