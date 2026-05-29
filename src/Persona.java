public class Persona {
    private String Nombre;
    private String Apellido;
    private String Edad;
    private String Nacionalidad;

    public Persona() {
        Nombre = "";
        Apellido = "";
        Edad = "";
        Nacionalidad = "";
    }

    public Persona(String Nombre, String Apellido, String Edad, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setApellido(String apellido){
        this.Apellido = apellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getEdad() {
        return Edad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }
}
