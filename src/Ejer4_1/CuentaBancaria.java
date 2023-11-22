package Ejer4_1;

public class CuentaBancaria {
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public CuentaBancaria(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0;
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("No es posible realizar el retiro. Verifique el saldo o la cantidad a retirar.");
        }
    }

    public void calcularComisionMensual() {
        comisionMensual = (saldo * (tasaAnual / 12)) / 100;
        saldo -= comisionMensual;
    }

    public void mostrarInformacion() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Comision mensual: " + comisionMensual);
    }

}