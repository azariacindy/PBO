public class RectangleMain06 {
    public static void main(String[] args) {
        // instantiate the Rectangle06 object
        Rectangle06 rect = new Rectangle06(5, 3);

        rect.displayInfo();

        // calculate and display area and circumference
        int area = rect.getArea();
        int circumference = rect.getCircumference();

        System.out.println("Area          : " + area);
        System.out.println("Circumference : " + circumference);
    }
}
