package Ejercicio4_1;

public class Herencia {
    protected float saldo;
    protected int numeroCosignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    public Herencia(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad){
        saldo=saldo+cantidad;
        numeroCosignaciones=numeroCosignaciones+1;
    }
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantida del retiro excede el saldo actual");
        }
    }
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }

}
