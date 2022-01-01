package case2.use;

import case2.base.AmericanStudent;
import case2.base.Student;
import case2.decorator.Art;
import case2.decorator.Science;

public class TestPattern {
    public static void main(String[] args) {
        Student g1 = new AmericanStudent();
        System.out.println(g1.getDescription());

        Student g2 = new Science(g1);
        System.out.println(g2.getDescription());

        Student g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}
