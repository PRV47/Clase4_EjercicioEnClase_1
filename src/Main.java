public class Main {
    public static void main(String[] args) {
        Circle crcl1 = new Circle(8);
        Square sqr1 = new Square(4);
        System.out.println("El area del circulo es de " + crcl1.area() + " unidades.");
        System.out.println("El area del cuadrado es de " + sqr1.area() + " unidades.");
        sqr1.rotate();
        sqr1.draw();
        crcl1.draw();
        }
    }