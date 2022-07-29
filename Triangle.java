public class Triangle extends Shapes {
    public Triangle(int _size, boolean _isHollow) {
        super(_size, _isHollow);
    }

    public void draw() {
        if (isHollow == false) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");

                }
                System.out.print("\n");
            }
        } else {
            // horiz
            for (int i = 0; i < size; i++) {
                // vert
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
