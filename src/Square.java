public class Square implements Shape, Rotable, Drawable{
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    public float area(){
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Se dibuja el cuadrado");
    }

    @Override
    public void rotate() {
        System.out.println("Se rota el cuadrado");
    }


}
