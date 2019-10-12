public class Tijera implements Mano {
    @Override
    public Resultado jugar(Mano mano) {
        return mano.jugarContraTijera(this);
    }

    @Override
    public Resultado jugarContraPapel(Papel papel) {
        return Resultado.GANA;
    }

    @Override
    public Resultado jugarContraPiedra(Piedra piedra) {
        return Resultado.PIERDE;
    }

    @Override
    public Resultado jugarContraTijera(Tijera tijera) {
        return Resultado.EMPATA;
    }
}
