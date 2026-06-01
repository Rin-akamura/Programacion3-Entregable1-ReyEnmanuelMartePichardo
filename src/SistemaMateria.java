import java.util.Scanner;
public class SistemaMateria {
    public int TotalMaterias = 0;
    Materia[] materias = new Materia[100];
    Scanner sc = new Scanner(System.in);
    public SistemaMateria() {
    }
    
    public void RegistrarMateria() {
        Materia materia = new Materia();
        System.out.println("=====================================");
        System.out.println("      .::REGISTRO DE MATERIAS::.     ");
        System.out.println("=====================================");

        System.out.print("Ingrese el nombre de la Materia: ");
        String Nombre = sc.nextLine();
        materia.setNombre(Nombre);
        System.out.println();

        System.out.print("Ingrese la modalidad de la asignatura: ");
        String Modalidad = sc.nextLine();
        materia.setModalidad(Modalidad);
        System.out.println();

        System.out.print("Ingrese el horario de la asignatura: ");
        String Horario = sc.nextLine();
        materia.setHorario(Horario);
        System.out.println();

        System.out.print("Ingrese el nombre del maestro que impartira la clase: ");
        String Maestro = sc.nextLine();
        materia.setMaestro(Maestro);
        System.out.println();

        System.out.print("Ingrese la clave de la asignatura: ");
        String clave = sc.nextLine();
        materia.setClave(clave);
        System.out.println();

        materias[TotalMaterias] = materia;
        TotalMaterias++;


    }

    public void BuscarMateria(){
        System.out.print("Ingrese la Clave de la materia: ");
        String clave = sc.nextLine();

        for(int i = 0; i < TotalMaterias; i++){
            if(materias[i].getClave().equals(clave)){
                materias[i].MostrarMateria();
                return;
            }
        }

        System.out.println("Materia no encontrada");
        
    }

    public Materia BuscarClave(String clave) {
        if(clave != null){
            for(int i = 0; i < TotalMaterias; i++){
                if(materias[i].getClave().equals(clave)){
                    return materias[i];
                }

            }
        } else{
            System.out.println("Materia no encontrada en el sistema");
        }

        return null;
    }
    

    public void MostrarMateria() {
        if(TotalMaterias == 0) {
            System.out.println("No hay materias registradas en el sistema");
            return;
        }
        for(int i = 0; i < TotalMaterias; i++){
            materias[i].MostrarMateria();
        }
    }
}
