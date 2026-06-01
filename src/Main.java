import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        SistemaMateria sistemaMateria = new SistemaMateria();
        SistemaEstudiante sistemaEstudiante = new SistemaEstudiante();
        SistemaMaestros sistemaMaestros = new SistemaMaestros();
        int op = 0;

        do{
            System.out.println("==============================================");
            System.out.println("       .::SISTEMA DE GESTION ACADEMICA::.     ");
            System.out.println("==============================================");

            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Profesor");
            System.out.println("3. Registrar Materia");
            System.out.println("4. Asignar materia a estudiante");
            System.out.println("5. Registrar Calificacion");
            System.out.println("6. Buscar Estudiante");
            System.out.println("7. Mostrar Estudiantes");
            System.out.println("8. Mostrar Materias");
            System.out.println("9. Mostrar reporte de promedios");
            System.out.println("10. Salir");

            System.out.print("Ingrese la opcion deseada: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    sistemaEstudiante.AgregarEstudiante();
                    break;
                case 2:
                    sistemaMaestros.RegistrarMaestro();
                    break;
                case 3:
                    sistemaMateria.RegistrarMateria();
                    break;
                case 4:
                    System.out.println("=========================================");
                    System.out.println("      .::Inscripcion de materias::.      ");
                    System.out.println("=========================================");

                    System.out.println("Ingrese la Matricula del estudiante: ");
                    String matricula = scanner.nextLine();
                    Estudiantes estudiante = sistemaEstudiante.BuscarMatricula(matricula);
                     if(estudiante == null){ 
                        System.out.println("Estudiante no encontrado en el sistema");
                        break;
                     }

                    System.out.println("Ingrese la clave de la materia: ");
                    String clave = scanner.nextLine();
                    Materia materia = sistemaMateria.BuscarClave(clave);
                    if(materia == null) {
                        System.out.println("Materia no encontrada en el sistema");
                        break;
                    }

                    estudiante.asignarMateria(materia);

                    break;
                case 5:
                    System.out.println("=========================================");
                    System.out.println("    .::Publicacion de calificacion::.    ");
                    System.out.println("=========================================");

                    System.out.println("Ingrese la Matricula del estudiante: ");
                    String Matricula = scanner.nextLine();
                    Estudiantes Est = sistemaEstudiante.BuscarMatricula(Matricula);
                    if(Est == null){ 
                        System.out.println("Estudiante no encontrado en el sistema");
                        break;
                     }

                    System.out.println("Ingrese la clave de la materia: ");
                    String Clave = scanner.nextLine();
                    if(Clave == null) {
                        System.out.println("Materia no encontrada en el sistema");
                        break;
                    }

                    Est.asignarCalificacion(Clave);
                    break;
                case 6:
                    sistemaEstudiante.BuscarEstudiantes();
                    break;
                case 7:
                    sistemaEstudiante.MostrarEstudiantes();
                    break;
                case 8:
                    sistemaMateria.MostrarMateria();
                    break;
                case 9:
                    sistemaEstudiante.ReportePromedios();
                    break;
                case 10:
                    System.out.println("Cerrando la sesion");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo nuevamente");
                    break;
            }

        }while(op != 10);
    }
    
}
