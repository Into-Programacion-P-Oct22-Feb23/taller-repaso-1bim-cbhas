package repaso01;

import java.util.Locale;
import java.util.Scanner;

public class Repaso01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreEmpleado;
        String mensaje = "";
        String opcion = "s";
        String ciudad;
        int cedula;
        int horasMatutinas;
        int horasNocturnas;
        double valorMatutino = 10;
        double valorNocturno = 15;
        double adicionalNocturno = 0;
        double totalSocial;
        double valorSocial = 18;
        double totalMatutino;
        double totalNocturno;
        double subtotal;
        double sueldoFinal;
        int contador = 0;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese el nombre del empleado: ");
            nombreEmpleado = entrada.nextLine();

            System.out.println("Ingrese la ciudad de la empresa: ");
            ciudad = entrada.nextLine();

            System.out.println("Ingrese la cédula del empleado: ");
            cedula = entrada.nextInt();

            System.out.println("Ingrese las horas matutinas trabajadas del "
                    + "empleado: ");
            horasMatutinas = entrada.nextInt();

            System.out.println("Ingrese las horas nocturnas trabajadas del "
                    + "empleado: ");
            horasNocturnas = entrada.nextInt();

            totalMatutino = horasMatutinas * valorMatutino;

            if (horasNocturnas >= 10) {
                adicionalNocturno = (valorNocturno * 10) / 100;
                valorNocturno = valorNocturno + adicionalNocturno;

            }

            totalNocturno = valorNocturno * horasNocturnas;
            valorNocturno = 15;

            subtotal = totalMatutino + totalNocturno;
            totalSocial = (subtotal * valorSocial) / 100;
            sueldoFinal = subtotal - totalSocial;

            mensaje = String.format("%sRol del trabajador de nombre %s y cédula %d."
                    + "\n\tHoras matutina trabajadas: %d.\n\tHoras nocturnas "
                    + "trabajadas: %d.\n\tSubtotal $%.2f\n\tSeguro Social $%.1f"
                    + "\n\tTotal a cancelar $%.1f\n\n",
                    mensaje,
                    nombreEmpleado,
                    cedula, horasMatutinas,
                    horasNocturnas,
                    subtotal,
                    totalSocial,
                    sueldoFinal);

            entrada.nextLine();

            contador = contador + 1;

            System.out.println("Si ya no quiere seguir ingresando datos, "
                    + "presione s ");
            opcion = entrada.nextLine();

            if (opcion.equals("s")) {
                bandera = false;
            }

        }
        System.out.printf("Nómina de trabajadores\n\n%sNúmero de empleados %d",
                mensaje,
                contador);
    }
}
