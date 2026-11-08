public class Rectangle {
    private Point coinHautGauche;
    private double largeur;
    private double hauteur;

    public Rectangle(Point coinHautGauche, double largeur, double hauteur) {
        this.coinHautGauche = new Point(coinHautGauche.x, coinHautGauche.y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double surface() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public Point coinBasDroit() {
        return new Point(coinHautGauche.x + largeur, coinHautGauche.y + hauteur);
    }

    public boolean contient(Point p) {
        double minX = coinHautGauche.x;
        double maxX = coinHautGauche.x + largeur;
        double minY = coinHautGauche.y;
        double maxY = coinHautGauche.y + hauteur;

        return (p.x >= minX && p.x <= maxX && p.y >= minY && p.y <= maxY);
    }

    public void translater(double dx, double dy) {
        this.coinHautGauche.x += dx;
        this.coinHautGauche.y += dy;
    }

    public void afficher() {
        System.out.print("Rectangle [coin : ");
        coinHautGauche.afficher();
        System.out.println(" , L=" + largeur + " , H=" + hauteur + "]");
    }
}