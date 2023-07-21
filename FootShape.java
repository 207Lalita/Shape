package Rectangle;
import java.util.Scanner;

public class FootShape {
    private Foot shape;
    public void getShapeType(String shapeType){
        switch (shapeType) {
            case "eclipse":
                shape = new Eclipse();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
        }
    }

    public String drawShape(){
        return shape.draw();
    }

    public static void main(String[] args) {
        FootShape app = new FootShape();
        System.out.print("What to draw? 1.Eclipse 2.Rectangle ");
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type) {
            case 1:
                app.getShapeType("eclipse");
                break;
            case 2:
                app.getShapeType("rectangle");
                break;
        }
        System.out.println(app.drawShape());

    }
}
