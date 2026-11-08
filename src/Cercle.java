public class Cercle {
    private Point centre;
    private double rayon;

    public Cercle(Point centre, double rayon) {

        this.centre = new Point(centre.x, centre.y);
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean contient(Point p) {

        return centre.distance(p) <= rayon;
    }

    public void afficher() {
        System.out.print("Cercle [centre : ");
        centre.afficher();
        System.out.println(" , R=" + rayon + "]");
    }
}