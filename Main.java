public class Main {
    public static void main(String[] args) {
        PreguntaAlternativa pregunta1 = new PreguntaAlternativa("¿Cuál es la capital de Chile? 1) Tarapacá 2) Coquimbo 3) Metropolitana", 3);
        PreguntaAlternativa pregunta2 = new PreguntaAlternativa("¿cual de estos lugares se encuentra en el centro de la serena? 1) Plaza de armas 2) mall plaza 3) jumbo", 1);
        PreguntaAlternativa pregunta3 = new PreguntaAlternativa("¿a cuanto esta actualmente el dolar? 1) 300-500 pesos 2) 800-900 pesos 3) 1000-1200 pesos", 2);
        PreguntaVerdaderoFalso pregunta4 = new PreguntaVerdaderoFalso("La capital de la región de Coquimbo es La Serena (V/F)", false);
        PreguntaVerdaderoFalso pregunta5 = new PreguntaVerdaderoFalso("chile tiene territorio en la antartica (V/F)", true);
        PreguntaVerdaderoFalso pregunta6 = new PreguntaVerdaderoFalso("chile gano la guerra del pacifico (V/F)", true);
        PreguntaEscrita pregunta7 = new PreguntaEscrita("¿Cuál es el actual presidente de Chile?", "boric");
        PreguntaEscrita pregunta8 = new PreguntaEscrita("¿cual es la primera region de chile?", "tarapaca");
        PreguntaEscrita pregunta9 = new PreguntaEscrita("¿cual es la principal atraccion turistica de la serena?", "el faro");

        int puntaje = 0;

        puntaje += pregunta1.responderPregunta();
        puntaje += pregunta2.responderPregunta();
        puntaje += pregunta3.responderPregunta();
        puntaje += pregunta4.responderPregunta();
        puntaje += pregunta5.responderPregunta();
        puntaje += pregunta6.responderPregunta();
        puntaje += pregunta7.responderPregunta();
        puntaje += pregunta8.responderPregunta();
        puntaje += pregunta9.responderPregunta();

        System.out.println("Puntaje total: " + puntaje +"/18");
    }
}
