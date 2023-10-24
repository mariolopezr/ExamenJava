import java.util.Scanner;

public class PreguntaAlternativa {
    private String pregunta;
    private int respuestaCorrecta;

    public PreguntaAlternativa(String pregunta, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int responderPregunta() {
        System.out.println(pregunta);
        System.out.println("Elige una respuesta (1/2/3): ");
        Scanner scanner = new Scanner(System.in);
        int respuesta = scanner.nextInt();
        return respuesta == respuestaCorrecta ? 2 : 0;
    }
}
