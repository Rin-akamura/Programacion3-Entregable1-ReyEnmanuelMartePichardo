import java.util.Scanner;

public class SistemaMaestros {
    public SistemaMaestros() {
    }

    Scanner scanner = new Scanner(System.in);
    Maestros[] maestros = new Maestros[100];
    int totalMaestros = 0;

    public void RegistrarMaestro(){
        Maestros maestro = new Maestros();
        System.out.println("========================================");
        System.out.println("      .::REGISTRO DE PROFESORES::.      ");
        System.out.println("========================================");

        System.out.print("Ingrese el nombre del profesor: ");
        String Nombre = scanner.nextLine();
        maestro.setNombre(Nombre);
        System.out.println();

        System.out.print("Ingrese el apellido del profesor: ");
        String Apellido = scanner.nextLine();
        maestro.setApellido(Apellido);
        System.out.println();

        System.out.print("Cual es el titulo del profesor: ");
        String Titulo = scanner.nextLine();
        maestro.setTitulo(Titulo);
        System.out.println();

        System.out.print("Ingrese el area de especializacion del profesor: ");
        String especialidad = scanner.nextLine();
        maestro.setEspecialidad(especialidad);
        System.out.println();

        System.out.println("Ingrese las Materias que impartira ");
        String materias = scanner.nextLine();
        maestro.setMaterias(materias);
        
        System.out.print("Ingrese el codigo del maestro: ");
        String codigo = scanner.nextLine();
        maestro.setClave(codigo);
        System.out.println();

        maestros[totalMaestros] = maestro;
        totalMaestros++;
    }

    public void BuscarMaestro(){
        System.out.println("Ingrese el codigo del maestro");
        String clave = scanner.nextLine();

        for(int i = 0; i < totalMaestros; i++){
            if(maestros[i].getClave().equals(clave)){
                maestros[i].MostrarMaestro();
                return;
            }
        }

        System.out.println("Maestro no encontrado");
    }

    
}
