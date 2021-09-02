package modelo;

public class Esfera implements IEsfera {

    public double radio;

    public Esfera(double r) {
        this.radio = r;
    }

    @Override
    public Double getR() {
        return radio;
    }

    @Override
    public Double volumen() {
        double volumen = (4 * Math.PI * Math.pow(getR(), 3)) / 3;
        return volumen;

    }

    @Override
    public Double superficie() {
        double superficie = 4 * Math.PI * Math.pow(getR(), 2);
        return superficie;
    }

    @Override
    public Double areaCirculo() {
        double area = Math.PI * Math.pow(getR(), 2);
        return area;
    }

    @Override
    public Double perimetroCirculo() {
        double perimetro = 2 * Math.PI * getR();
        return perimetro;

    }

    @Override
    public void setR(Double r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
