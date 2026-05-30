import java.util.Scanner;
public class SistemaEstudiante {
    Scanner sc = new Scanner(System.in);
    

    Materia[] materias = new Materia[100];
    Estudiantes[] registroE = new Estudiantes[100];
    int totalEstudiante = 0;

    
    public SistemaEstudiante() {
    }

    public void AgregarEstudiante() {
        Estudiantes estudiante = new Estudiantes();

        System.out.println("========================================");
        System.out.println("      .::REGISTRO DE ESTUDIANTE::.      ");
        System.out.println("========================================");

        System.out.print("Nombre del estudiante: ");
        String Nombre = sc.nextLine();
        estudiante.setNombre(Nombre);
        System.out.println();

        System.out.print("Apellidos del estudiante: ");
        String Apellido = sc.nextLine();
        estudiante.setApellido(Apellido);
        System.out.println();

        System.out.print("Edad del estudiante: ");
        String Edad = sc.nextLine();
        estudiante.setEdad(Edad);
        System.out.println();

        System.out.print("Nacionalidad del Estudiante: ");
        String Nacionalidad = sc.nextLine();
        estudiante.setNacionalidad(Nacionalidad);
        System.out.println();

        System.out.print("Matricula del estudiante: ");
        String Matricula = sc.nextLine();
        estudiante.setMatricula(Matricula);
        System.out.println();

        System.out.print("Carrera del estudiante: ");
        String Carrera = sc.nextLine();
        estudiante.setCarrera(Carrera);
        System.out.println();

        System.out.print("Estado del estudiante: ");
        String Estado = sc.nextLine();
        estudiante.setEstado(Estado);
        System.out.println();

        System.out.print("Fecha de inscripcion del estudiante: ");
        String FechaInscripcion = sc.nextLine();
        estudiante.setFechaInscripcion(FechaInscripcion);
        System.out.println();

        registroE[totalEstudiante] = estudiante;
        totalEstudiante++; 
        
    }

    public void BuscarEstudiantes() {
        System.out.println("========================================");
        System.out.println("     .::BASE DE DATOS ESTUDIANTIL::.    ");
        System.out.println("========================================");

        System.out.print("Ingrese la matricula del estudiante: ");

        String Matricula = sc.nextLine();

        if(Matricula != null){
            for(int i = 0; i < totalEstudiante; i++){
                if(registroE[i].getMatricula().equals(Matricula)){
                    registroE[i].MostrarEstudiante();
                    return;
                }
            }
        } else{
            System.out.println("Estudiante no encontrado en el sistema");
            return;
        }
    }
    
    
}
