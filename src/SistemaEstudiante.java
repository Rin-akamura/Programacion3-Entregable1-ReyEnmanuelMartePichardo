import java.util.Scanner;
public class SistemaEstudiante {
    Scanner sc = new Scanner(System.in);
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

        System.out.print("Ingrese la matricula o nombre del estudiante: ");

        String dato = sc.nextLine();

        if(dato != null){
            for(int i = 0; i < totalEstudiante; i++){
                if(registroE[i].getMatricula().equals(dato)){
                    registroE[i].MostrarEstudiante();
                    return;
                } 
                else if(registroE[i].getNombre().equals(dato)){
                    registroE[i].MostrarEstudiante();
                    return;
                }

            }
        } 
        if(totalEstudiante == 0){
            System.out.println("Estudiante no encontrado en el sistema");
        }
    }

    public void MostrarEstudiantes() {
        if(totalEstudiante == 0){
            System.out.println("No hay estudiantes registrados en el sistema");
            return;
        }
        for(int i = 0; i < totalEstudiante; i++) {
            registroE[i].MostrarEstudiante();
        }
    }

    public Estudiantes BuscarMatricula(String matricula){
        if(matricula != null){
            for(int i = 0; i < totalEstudiante; i++){
                if(registroE[i].getMatricula().equals(matricula)){
                    return registroE[i];
                }

            }
        } else{
            System.out.println("Estudiante no encontrado en el sistema");
        }

        return null;
    }
    
    public void ReportePromedios(){
        System.out.println("========================================");
        System.out.println("      .::REPORTE DE PROMEDIOS::.      ");
        System.out.println("========================================");

        if(totalEstudiante == 0) {
            System.out.println("No hay estudiantes registrados en el sistema");
            return;
        }

        for(int i = 0; i < totalEstudiante; i++){
            Estudiantes estudiante = registroE[i];
            if(estudiante.totalMaterias == 0){
                System.out.println(estudiante.getNombre() + " no tiene materias inscritas");
                return;
            }

            double suma = 0;

            for(int j = 0; j < estudiante.totalMaterias; j++){
                suma += estudiante.materias[j].getCalificacion();
            }

            double promedio = suma / estudiante.totalMaterias;

            System.out.println("----------------------------------------");
            System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());

            System.out.println("Matricula: " + estudiante.getMatricula());

            System.out.println("Promedio: " + promedio);

            if(promedio >= 70){
                System.out.println("Estado: APROBADO");
            }else{
                System.out.println("Estado: REPROBADO");
            }

            System.out.println("----------------------------------------");

            
        }

    }
}
