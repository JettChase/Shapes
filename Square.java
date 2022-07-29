public class Square extends Shapes {

    public Square(int _size, boolean _isHollow) {
        super(_size, _isHollow);
    }

    public void draw() {
        // top
        if (isHollow == false) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } else {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            for (int j = 0; j < size - 2; j++) {
                for (int i = 0; i < size; i++) {
                    if (i == 0 || i == size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
