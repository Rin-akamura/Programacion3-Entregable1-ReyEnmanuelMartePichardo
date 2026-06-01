public class Materia {
    private String nombre;
    private String horario;
    private String clave;
    private String modalidad;
    private String Maestro;
    private int calificacion;

    public Materia() {
        nombre = "";
        horario = "";
        clave = "";
        modalidad = "";
        calificacion = 0;
        Maestro = "";
    }

    public Materia (String nombre, String horario, String clave, String modalidad, int calificacion, String Maestro){
        this.nombre = nombre;
        this.horario = horario;
        this.clave = clave;
        this.modalidad = modalidad;
        this.calificacion = calificacion;
        this.Maestro = Maestro;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario () {
        return horario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setCalificacion(int Calificacion) {
        this.calificacion = Calificacion;
    }

    public int getCalificacion () {
        return calificacion;
    }

    public void setMaestro(String maestro){
        this.Maestro = maestro;
    }

    public String getMaestro() {
        return Maestro;
    }

    public void MostrarMateria() {
        System.out.println("" + getClave() + " " + getNombre());
        System.out.println("Horario: " + getHorario());
        System.out.println("Modalidad: " + getModalidad());
        System.out.println("Maestro: " + getMaestro());
        System.out.println("Calificacion: " + getCalificacion());
    }


}
