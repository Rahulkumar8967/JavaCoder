package LabManual;
    class rectangle {
        int length, width;
        rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }
    }

    class perimeter extends rectangle {
        perimeter(int l, int w) {
            super(l, w);
        }
        void printPeri() {
            System.out.println(2 * (length + width));
        }
    }

    class Area extends rectangle {
        Area(int l, int w) {
            super(l, w);
        }
        void printArea() {
            System.out.println(length * width);
        }
    }

    class volume extends rectangle {
        int height;
        volume(int l, int w, int h) {
            super(l, w);
            height = h;
        }
        void printVol() {
            System.out.println(length * width * height);
        }
    }
public class Exp5{
        public static void main(String[] args) {
            perimeter p1 = new perimeter(3, 4);
            System.out.println("Perimeter is");
            p1.printPeri();

            Area p2 = new Area(3, 4);
            System.out.println("Area is");
            p2.printArea();

            volume p3 = new volume(3, 4, 5);
            System.out.println("Perimeter is");
            p3.printVol();
        }
}