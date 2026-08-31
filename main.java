public class main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.apellido = "Perez";
        estudiante1.edad = 20;
        estudiante1.carrera = "Ingenieria";
        estudiante1.promedio = 8.5;

        Estudiante estudiante2 = new Estudiante(
"Maria", "Gomez", 22, "Medicina", 9.2
        );

        Estudiante estudiante3 = new Estudiante(
"Carlos", "Lopez", 21, "Derecho", 7.8
        );

        Estudiante[] estudiantes = {
        estudiante1, estudiante2, estudiante3
        };

        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.nombre + " - Promedio: " + estudiante.promedio);
        }
    }
}