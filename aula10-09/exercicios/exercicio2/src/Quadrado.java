import javax.swing.JOptionPane;

public class Quadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;
    
    public Quadrado(){
        this(0.0, 0.0);
    }
    public Quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }
    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }
    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    public double calcularArea(double ladoA){
        setAreaQuadrado(Math.pow(ladoA, 2));
        return getAreaQuadrado();
    }
    public double calcularPerimetro(double ladoA){
        setPerimetroQuadrado(ladoA * 4);
        return getPerimetroQuadrado();
        
    }
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "*** Calculo Quadrado *** \n Área do quadrado: " + getAreaQuadrado() + "\n Perímetro do quadrado: " + getPerimetroQuadrado());
    }
}
