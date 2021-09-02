package modelo;

public interface IEsfera {
    //Usar fórmula: 
//http://es.onlinemschool.com/math/assistance/figures_volume/sphere/

    public Double volumen();
    //Usar fórmula: 
//http://es.onlinemschool.com/math/assistance/figures_area_1/sphere/

    public Double superficie();
    //Usar fórmula: http://mimosa.pntic.mec.es/clobo/geoweb/area7.htm 
//(ÁREA DEL CÍRCULO)

    public Double areaCirculo();
    //Usar fórmula: http://mimosa.pntic.mec.es/clobo/geoweb/area7.htm 

    //(LONGITUD DE LA CIRCUNFERENCIA)
    public Double perimetroCirculo();

    //Radio
    public void setR(Double r);

    public Double getR();
}
