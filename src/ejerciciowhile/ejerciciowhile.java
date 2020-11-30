package ejerciciowhile;

public class ejerciciowhile {

    public static void main(String[] args) {
        int numeroInicio = 10;

        do {
            int resultado = numeroInicio % 2;

            if (resultado == 0) {
                System.out.println("El numero: " + numeroInicio + " Es par");
                numeroInicio++;
            }

            numeroInicio++;
        } while (numeroInicio <= 20);
    }
}
