public class Piedra implements Mano {
    @Override
    public Resultado jugar(Mano mano) {
        return mano.jugarContraPiedra(this);
    }

    @Override
    public Resultado jugarContraPapel(Papel papel) {
        return Resultado.PIERDE;
    }

    @Override
    public Resultado jugarContraPiedra(Piedra piedra) {
        return Resultado.EMPATA;
    }

    @Override
    public Resultado jugarContraTijera(Tijera tijera) {
        return Resultado.GANA;
    }
}
