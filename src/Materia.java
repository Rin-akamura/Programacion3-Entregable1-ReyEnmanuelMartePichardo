public class Materia {
    private String nombre;
    private String horario;
    private String clave;
    private String modalidad;

    public Materia() {
        nombre = "";
        horario = "";
        clave = "";
        modalidad = "";
    }

    public Materia (String nombre, String horario, String clave, String modalidad){
        this.nombre = nombre;
        this.horario = horario;
        this.clave = clave;
        this.modalidad = modalidad;
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

    
}
