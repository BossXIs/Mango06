public class Main {
    public static void main(String[] args) {

       Circle c = new Circle();
        c.draw();
       Square s = new Square();
        s.draw();
        ShapeFactory sf = new ShapeFactory();
        Shape f = (Shape) sf.getShape(0);
        f.draw();
    }
}