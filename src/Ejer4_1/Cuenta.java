package Ejer4_1;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {

       saldo =saldo+cantidad;
       numeroConsignaciones=numeroConsignaciones+1;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo-cantidad;
        if (nuevoSaldo>=0){
            saldo-=cantidad;
            numeroRetiros=numeroRetiros+1;
                   }else {
            System.out.println("No es posible realizar el retiro. Verifique el saldo o la cantidad a retirar.");
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 12)) / 100;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        calcularInteresMensual();
        saldo -= comisionMensual;
    }

    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Comisión mensual: $" + comisionMensual);
    }

}