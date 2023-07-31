public class Cricle extends Shape {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }
    public void calArea(){
        area= Math.PI*radius*radius;
    }
}
