public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point autre) {

        double dx = this.x - autre.x;
        double dy = this.y - autre.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void afficher() {
        System.out.print("(" + x + ", " + y + ")");
    }
}