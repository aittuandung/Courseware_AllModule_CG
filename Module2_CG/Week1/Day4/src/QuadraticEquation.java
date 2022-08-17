public class QuadraticEquation {
    private double a,b,c;
    double del, root1, root2 ;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b ;
        this.c = c ;
    }

    public double getDiscriminant(){
        return del = this.b * this.b - 4* this.a * this.c;
    }

    public double getRoot1(){
        return root1 = (-b + Math.sqrt(del)) / (2*a);
    }

    public double getRoot2(){
        return root1 = (-b - Math.sqrt(del)) / (2*a);
    }
}
