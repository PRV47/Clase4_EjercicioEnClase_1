public class Circle implements Shape, Drawable{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;

    }
    @Override
    public float area() {
        return (float) (3.14*radius*2);
    }
    @Override
    public void draw(){
        System.out.println("Se dibuja un circulo");
    }
}
