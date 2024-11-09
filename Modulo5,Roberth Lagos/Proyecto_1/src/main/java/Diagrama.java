
public class Diagrama {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo("Rojo", 5.0);
        Linea linea = new Linea("Azul", 10.0);
        Triangulo triangulo = new Triangulo("Verde", 7.0, 5.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);

        
        circulo.dibujar();
        System.out.println("Radio Del Circulo: " + circulo.calcularRadio());

        linea.dibujar();
        System.out.println("Largo De La Linea: " + linea.getLargo());

        triangulo.dibujar();
        System.out.println("Area Del Triangulo: " + triangulo.calcularArea());

        cuadrado.dibujar();
        System.out.println("Area Del Cuadrado: " + cuadrado.calcularArea());
    }
}


class Formas {
    protected String color;

    public Formas(String color) {
        this.color = color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void dibujar() {
        System.out.println("\nDibujando Una Forma.");
    }
}


class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double calcularRadio() {
        return radio;
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando Un Circulo.");
         System.out.println("     * * * * * *");
        System.out.println("   *               *");
        System.out.println(" *                   *");
        System.out.println("*                     *");
        System.out.println("*                     *");
        System.out.println("*                     *");
        System.out.println(" *                   *");
        System.out.println("   *               *");
        System.out.println("      * * * * * *");
    }
}


class Linea extends Formas {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando Una Linea.");
        System.out.println("______________________");
    }
}

class Triangulo extends Formas {
    private double Base;
    private double Altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.Base = base;  
        this.Altura = altura;  
    }

    public double calcularArea() {
        return 0.5 * Base * Altura;
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando Un Triangulo.");
        System.out.println("        *");
        System.out.println("      *   *");
        System.out.println("    *       *");
        System.out.println("  *           *");
        System.out.println("* * * * * * * * *");
    }
}


class Cuadrado extends Formas {
    private double area;

    public Cuadrado(String color, double area) {
        super(color);
        this.area = area;
    }

    public double calcularArea() {
        return area;
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando Un Cuadrado.");
         System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");
    }
}

