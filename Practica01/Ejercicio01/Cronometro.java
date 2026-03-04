public class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }

    // Getters
    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }

    // Reinicia 
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    // Detiene 
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    // Devuelve el lapso en milisegundos
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}

