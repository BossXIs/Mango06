public class ShapeFactory {
    public Shape getShape(int shapeType){
        switch(shapeType) {
            case 0:
                return new Square();
            default:
                return new Circle();
        }
    }
}
