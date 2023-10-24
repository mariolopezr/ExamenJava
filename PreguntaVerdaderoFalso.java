import java.util.Scanner;

public class PreguntaVerdaderoFalso {
    private String pregunta;
    private boolean respuestaCorrecta;

    public PreguntaVerdaderoFalso(String pregunta, boolean respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int responderPregunta() {
        System.out.println(pregunta);
        System.out.println("Responde con true o false: ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.next();
        return (respuesta.equalsIgnoreCase("v") || respuesta.equalsIgnoreCase("f")) == respuestaCorrecta ? 1 : 0;
    }
}
