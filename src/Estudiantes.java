public class Estudiantes extends Persona {
    private String Matricula;
    private String Carrera;
    private String Estado;
    private String FechaInscripcion;
    Materia materia = new Materia();

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
        materia.MostrarMateria();
        System.out.println("------------------------------------------");
    }

    
}
