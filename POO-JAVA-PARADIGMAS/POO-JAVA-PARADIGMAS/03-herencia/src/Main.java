public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 4500000, "Tecnologia");
        Desarrollador dev = new Desarrollador("Carlos", 3800000, "Java");

        gerente.mostrarInformacion();
        gerente.mostrarArea();
        System.out.println("-----");
        dev.mostrarInformacion();
        dev.mostrarLenguaje();
    }
}
