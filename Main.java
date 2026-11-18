import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        SistemaCLI moduloInscripciones = new SistemaCLI();
        ModuloCalendario moduloCalendario = new ModuloCalendario();

        int opcion = 0;
        do {
            System.out.println("\n   * CAMPEONATO BARRIAL *  \n");
            System.out.println("1. Gestion de equipos y jugadores");
            System.out.println("2. Generar calendario con los equipos inscritos");
            System.out.println("3. Consultar próximos encuentros");
            System.out.println("4. Reprogramar partido");
            System.out.println("5. Gestionar asistencia o incomparecencia");
            System.out.println("6. Salir");
            System.out.print("seleccione una opción: \n");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:

                        moduloInscripciones.mostrarMenu();
                        break;
                    case 2:

                        List<String> nombresEquipos = new ArrayList<>();
                        for (Equipo eq : moduloInscripciones.equipos) {
                            nombresEquipos.add(eq.getNombreEquipo());
                        }
                        moduloCalendario.generarCalendario(nombresEquipos, "cancha principal", 14);
                        break;
                    case 3:
                        moduloCalendario.consultarCalendario();
                        break;
                    case 4:
                        moduloCalendario.reprogramarPartido(scanner);
                        break;
                    case 5:
                        moduloCalendario.gestionarIncomparecencia(scanner);
                        break;
                    case 6:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: ingrese un numero valido.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}