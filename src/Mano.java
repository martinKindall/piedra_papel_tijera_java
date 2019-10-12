public interface Mano {

    Resultado jugar(Mano mano);
    Resultado jugarContraPapel(Papel papel);
    Resultado jugarContraPiedra(Piedra piedra);
    Resultado jugarContraTijera(Tijera tijera);
}
