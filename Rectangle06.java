public class Rectangle06 {
    // attributes declaration
    public int length;
    public int width;

    // declaration with constructor
    public Rectangle06(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // method to display
    public void displayInfo() {
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
    }

    // Method to calculate the area(luas)
    public int getArea() {
        return length * width;
    }

    // Method to calculate the circumference(keliling)
    public int getCircumference() {
        return 2 * (length + width);
    }
}
