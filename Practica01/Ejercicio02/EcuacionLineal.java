public class EcuacionLineal {

    private double a, b, c, d, e, f;

    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean tieneSolucion() {
        return (a * d - b * c) != 0.0;
    }

    public Double getX() {
        if (tieneSolucion()) {
            return (e * d - b * f) / (a * d - b * c);
        }
        return null;
    }

    public Double getY() {
        if (tieneSolucion()) {
            return (a * f - e * c) / (a * d - b * c);
        }
        return null;
    }
}
