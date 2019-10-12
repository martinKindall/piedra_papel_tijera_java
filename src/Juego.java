public class Juego {

    public static void main(String[] args) {
        Mano manoJugador1 = new Piedra();
        Mano manoJugador2 = new Tijera();

        Resultado resultadoJugador2 = manoJugador1.jugar(manoJugador2);

        switch (resultadoJugador2) {
            case GANA: System.out.println("Gana jugador 2!");
                break;
            case PIERDE: System.out.println("Gana jugador 1!");
                break;
            case EMPATA: System.out.println("Empate");
                break;
            default: throw new IllegalArgumentException("Resultado erróneo.");
        }
    }
}
