
public class TransmisionEnVivo extends ContenidoDigital {

    private String canal;
    private boolean enCurso;


    public TransmisionEnVivo(String titulo, int duracionMinutos,
                             String canal, boolean enCurso) {

        super(titulo, duracionMinutos);
        this.canal = canal;
        this.enCurso = enCurso;
    }

    @Override
    public void reproducir() {

        System.out.println("\n=== TRANSMISION EN VIVO ===");

        mostrarInformacion();

        System.out.println("Canal: " + canal);

        if (enCurso) {

            System.out.println("Conectando con el servidor de streaming...");
            System.out.println("La transmision se esta reproduciendo en vivo.");

        } else {

            System.out.println("Error: La transmision no se encuentra en curso.");

        }
    }
}
