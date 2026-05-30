public class Maestros extends Persona {
    private String Titulo;
    private String Especialidad;
    private String Materias;
    private String Clave;
    
    public Maestros () {
        Titulo = "";
        Especialidad = "";
        Materias = "";
        Clave = "";
        super();
    }

    public Maestros (String titulo, String especialidad, String clave, String Nombre, String apellido, String edad, String nacionalidad){
        super(Nombre, apellido, edad, nacionalidad);
        this.Titulo = titulo;
        this.Especialidad = especialidad;
        this.Clave = clave;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setEspecialidad (String especialidad) {
        this.Especialidad = especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setMaterias(String materias){
        this.Materias = materias;
    } 

    public String getMaterias() {
        return Materias;
    }

    public void setClave(String clave) {
        this.Clave = clave;
    }

    public String getClave() {
        return Clave;
    }

    public void MostrarMaestro() {
        System.out.println("-----------------------------------------");
        System.out.println("-- " + getNombre() + " " + getApellido());
        System.out.println("-- " + getEdad());
        System.out.println("-- " + getNacionalidad());
        System.out.println("-- " + Titulo);
        System.out.println("-- " + Especialidad);
        System.out.println("Materias: " /*+ MostrarMaterias()*/);
        System.out.println("-----------------------------------------");
    }
}
