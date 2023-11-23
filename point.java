public class Point {
    private double abscisse;
    private double ordonné;

    public Point() {
        this.abscisse = 0;
        this.ordonné = 0;
    }

    public Point(double abscisse, double ordonné) {
        this.abscisse = abscisse;
        this.ordonné = ordonné;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double valeur) {
        this.abscisse = valeur;
    }

    public double getOrdonné() {
        return ordonné;
    }

    public void setOrdonné(double valeur) {
        this.ordonné = valeur;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.abscisse - point.abscisse, 2) + Math.pow(this.ordonné - point.ordonné, 2));
    }

    public double norm() {
        return Math.sqrt(Math.pow(this.abscisse, 2) + Math.pow(this.ordonné, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(4, 3);

        System.out.println("Distance: " + point1.distance(new Point(0, 0)));
        System.out.println("Norm: " + point1.norm());
    }
}
