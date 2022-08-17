package Sử_dụng_lớp_IllegalTriangleException;

public class Triangle {
    public void triangle(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            throw new TriangleEdgesException("this is not a Triangle");
        }else {
            System.out.println("this is a Triangle");
        }
    }
}
