
public class Pelicula extends ContenidoDigital {

    private String genero;

    public Pelicula(String titulo, int duracionMinutos, String genero) {
        super(titulo, duracionMinutos);
        this.genero = genero;
    }

    @Override
    public void reproducir() {

        System.out.println("\n=== REPRODUCIENDO PELICULA ===");

        mostrarInformacion();

        System.out.println("Genero: " + genero);
        System.out.println("Iniciando reproduccion de la pelicula...");
        System.out.println("La pelicula se esta reproduciendo correctamente.");
    }
}
