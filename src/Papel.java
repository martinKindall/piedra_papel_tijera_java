public class Papel implements Mano {
    @Override
    public Resultado jugar(Mano mano) {
        return mano.jugarContraPapel(this);
    }

    @Override
    public Resultado jugarContraPapel(Papel papel) {
        return Resultado.EMPATA;
    }

    @Override
    public Resultado jugarContraPiedra(Piedra piedra) {
        return Resultado.GANA;
    }

    @Override
    public Resultado jugarContraTijera(Tijera tijera) {
        return Resultado.PIERDE;
    }
}
