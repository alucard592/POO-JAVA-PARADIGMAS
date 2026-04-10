public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Andres Gomez");
        Curso curso = new Curso("POO en Java", profesor);
        curso.mostrarCurso();
    }
}
