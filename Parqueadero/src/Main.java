import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();



        int resultado1 = parqueadero.entrarCarro("APX147");
        int resultado2 = parqueadero.entrarCarro("ABD475");


        System.out.println("Estado actual del parqueadero:");
        System.out.println("Hora actual: " + parqueadero.darHoraActual());
        System.out.println("Parqueadero abierto: " + parqueadero.estaAbierto());
        System.out.println("Tarifa actual: " + parqueadero.darTarifa());
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
        System.out.println("Monto en caja: " + parqueadero.darMontoCaja());


        int montoPagar = parqueadero.sacarCarro("APX147");


        if (montoPagar == Parqueadero.CARRO_NO_EXISTE) {
            System.out.println("El carro no existe en el parqueadero.");
        } else if (montoPagar == Parqueadero.PARQUEADERO_CERRADO) {
            System.out.println("El parqueadero está cerrado.");
        } else {
            System.out.println("Carro sacado exitosamente. Monto a pagar: " + montoPagar);
        }


        for (int i = 0; i < 4; i++) {
            parqueadero.avanzarHora();
        }


        parqueadero.cambiarTarifa(1500);


        System.out.println("Estado actual del parqueadero después de Salida:");
        System.out.println("Hora actual: " + parqueadero.darHoraActual());
        System.out.println("Parqueadero abierto: " + parqueadero.estaAbierto());
        System.out.println("Tarifa actual: " + parqueadero.darTarifa());
        System.out.println("Puestos libres: " + parqueadero.calcularPuestosLibres());
        System.out.println("Monto en caja: " + parqueadero.darMontoCaja());

        System.out.println("El tiempo promedio de parque es: " + parqueadero.darTiempoPromedio()+"Horas");

        ArrayList<Carro> carrosMasDeTresHoras = parqueadero.darCarrosMasDeTresHorasParqueados();


        for (Carro carro : carrosMasDeTresHoras) {
            System.out.println("Lleva mas de 3 horas , Su Placa es: " + carro.darPlaca());
        }

        System.out.println("Carros que comienzan con PB"+parqueadero.contarCarrosQueComienzanConPlacaPB());
    }
}
