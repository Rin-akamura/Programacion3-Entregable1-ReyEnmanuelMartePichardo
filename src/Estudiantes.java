import java.util.Scanner;
public class Estudiantes extends Persona {
    private Scanner sc = new Scanner(System.in);
    private String Matricula;
    private String Carrera;
    private String Estado;
    private String FechaInscripcion;
    Materia[] materias = new Materia[20];
    int totalMaterias = 0;

    public Estudiantes() {
        super();
        Matricula = ""; 
        Carrera = "";
        Estado = "";
        FechaInscripcion = "";

    }

    public Estudiantes(String Matricula, String Carrera, String Estado, String FechaInscripcion, String Nombre, String Apellido, String Edad, String Nacionalidad){
        super(Nombre, Apellido, Edad, Nacionalidad);
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        this.Estado = Estado;
        this.FechaInscripcion = FechaInscripcion;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setCarrera(String carrera) {
        this.Carrera = carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setFechaInscripcion(String fecha) {
        this.FechaInscripcion = fecha;
    }

    public String getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void MostrarEstudiante() {
        System.out.println("------------------------------------------");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nacionalidad: " + getNacionalidad());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Estado: " + getEstado());
        System.out.println("Fecha de Inscripcion: " + getFechaInscripcion());
        System.out.println("Materias inscritas");
        if(totalMaterias == 0){
                System.out.println("El estudiante no tiene materias inscritas");
                return;
        }else {
            for(int i = 0; i < totalMaterias; i++){
                System.out.println("" + materias[i].getClave() + " - " + materias[i].getNombre() + "|  Calificacion: " + materias[i].getCalificacion());
            }
        }
        System.out.println("------------------------------------------");
    }

    public void asignarMateria(Materia materia){
        materias[totalMaterias] = materia;
        totalMaterias++;
        
        System.out.println("Materia agregada correctamente");
    }

    public void asignarCalificacion(String clave){
        if(clave != null) {
            for(int i = 0; i < totalMaterias; i++){
                if(materias[i].getClave().equals(clave)){
                    System.out.println("Ingrese la calificacion: ");
                    int calificacion = sc.nextInt();
                    materias[i].setCalificacion(calificacion);
                    return;

                }
            }
        } else{
            System.out.println("Materia no encontrada en el sistema");
        }    
    }

    
}
