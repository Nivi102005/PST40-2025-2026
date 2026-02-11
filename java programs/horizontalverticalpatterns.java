package pst;

public class horizontalverticalpatterns {

    public static void main(String[] args) {
        int n = 10;

        ClassHorizontalPattern h = new ClassHorizontalPattern();
        h.horizontal(n);

        ClassVerticalPattern v = new ClassVerticalPattern();
        v.vertical(n);
    }
}

class ClassHorizontalPattern {
    void horizontal(int n) {
        System.out.println("Horizontal:");
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println(); 
    }
}


class ClassVerticalPattern {
    void vertical(int n) {
        System.out.println("Vertical:");
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
