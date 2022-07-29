public class Diamond extends Shapes {
    public Diamond(int _size, boolean _isHollow) {
        super(_size, _isHollow);
    }

    public void draw() {
        if (isHollow == false) {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {
                    if (i == (size / 2) + 1 - i) {
                        System.out.print("*");
                    } else if (i == (size / 2) + 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                
                }
                } else {
                
                }
            }
        }else

    {

    }System.out.print("\n");
}}
