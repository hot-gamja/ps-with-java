package ps_test;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 4;
        c.height = 5;

        System.out.printf("원기둥의 부피 : %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이 : %.2f\n", c.getArea());
    }

}

class Cylinder {
    double radius;
    double height;

    double getVolume() {
        return Math.PI * radius * radius * height;
    }

    double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
