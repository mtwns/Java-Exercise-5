import classes.Alumno;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(00, "Isaias", "Cuevas");
        alumno1.presentacion();

        Alumno alumno2 = new Alumno();
        alumno2.setId(01);
        alumno2.setNombre("Jemarie");
        alumno2.setApellido("Leonor");
        alumno2.presentacion();

    }
}