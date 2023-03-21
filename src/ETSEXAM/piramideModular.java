package ETSEXAM;


/**
 * Esta clase representa una pirámide, definido por su altura y el lado de su
 * base.
 * 
 * @author Christian
 */
public class piramideModular {
    private double ladoBase;
    private double altura;

    /**
     * Constructor vacío de la clase piramideModular
     */
    public piramideModular() {

    }

    /**
     * Constructor con parámetros de la clase piramideModular.
     * 
     * @param ladoBase Tamaño del lado de la base de la pirámide
     * @param altura   Altura de la pirámide
     */
    public piramideModular(double ladoBase, double altura) {
        this.altura = altura;
        this.ladoBase = ladoBase;
    }

    /**
     * Devuelve la altura de la pirámide
     * 
     * @return double Altura de la pirámide
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura de la pirámide
     * 
     * @param nAltura Nueva altura
     */
    public void setAltura(double nAltura) {
        this.altura = nAltura;
    }

    /**
     * Devuelve el lado de la base
     * 
     * @return double Lado de la base
     */
    public double getLadoBase() {
        return ladoBase;
    }

    /**
     * Establece el lado de la base
     * 
     * @param nLadoBase Nuevo lado de la base
     */
    public void setLadoBase(double nLadoBase) {
        this.ladoBase = nLadoBase;
    }

    /**
     * Método que calcula el area de la base según el lado de esta
     * 
     * @return double Area de la base de la pirámide
     */
    public double calcularAreaBase() {
        double areaBase = ladoBase * ladoBase;
        return areaBase;
    }

    /**
     * Método que calcula el volumen de la pirámide según el área de la base y la
     * altura
     * 
     * @return float Volumen de la pirámide
     */
    public float calcularVolumen() {
        float volumen;
        volumen = ((float) this.calcularAreaBase() * (float) altura) / 3;
        return volumen;
    }

}
