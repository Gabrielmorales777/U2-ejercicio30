
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ContenidoDigital> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula(
                "Interestelar", 169, "Ciencia ficcion"
        ));

        contenidos.add(new Pelicula(
                "El origen", 148, "Suspenso"
        ));

        contenidos.add(new EpisodioSerie(
                "El comienzo", 45, 1, 1
        ));

        contenidos.add(new EpisodioSerie(
                "La investigacion", 52, 1, 2
        ));

        contenidos.add(new TransmisionEnVivo(
                "Final del campeonato", 120, "Deportes TV", true
        ));

        contenidos.add(new TransmisionEnVivo(
                "Concierto en directo", 90, "Music Live", false
        ));

        System.out.println("==================================");
        System.out.println("      REPRODUCTOR UNIVERSAL");
        System.out.println("==================================");

        for (ContenidoDigital contenido : contenidos) {

            contenido.reproducir();

            System.out.println("----------------------------------");
        }
    }
}
