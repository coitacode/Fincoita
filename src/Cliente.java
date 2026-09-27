public class Cliente {
    private int id;
    private String nombre;
    private double limiteCredito;
    private double deudaActual;

    public Cliente (int id, String nombre, double limiteCredito, double saldoActual){
        this.id = id;
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.deudaActual= saldoActual;
    }
    public boolean solicitarPrestamo(double montoSolicitado){

    if(deudaActual + montoSolicitado <= limiteCredito){

        deudaActual+=montoSolicitado;
        System.out.println("Prestamo aprobado");
        return true;
    }else {
        System.out.println("Prestamo rechazado, supera el limite de credito");
        return false;
    }

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getLimiteCredito(){
    return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }

    public double getDeudaActual() {
        return deudaActual;
    }

    public void setDeudaActual(double deudaActual) {
        this.deudaActual = deudaActual;
    }
    @Override
    public String toString(){
        return "[ Cliente: " +
                "ID "+id
                + " | NOMBRE "+  nombre
                +" | LIMITE DE CREDITO $ "+ limiteCredito
                + " | DEUDA ACTUAL $ " +deudaActual + "]";

    }
}
