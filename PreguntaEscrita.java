import java.util.Scanner;

public class PreguntaEscrita {
    private String pregunta;
    private String respuestaCorrecta;

    public PreguntaEscrita(String pregunta, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int responderPregunta() {
        System.out.println(pregunta);
        System.out.println("Escribe tu respuesta: ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase(respuestaCorrecta) ? 3 : 0;
    }
}

