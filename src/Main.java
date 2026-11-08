public class Main {
    public static void main(String[] args) {
        // Données de test
        Rectangle R = new Rectangle(new Point(1, 1), 4, 3);
        Cercle C = new Cercle(new Point(0, 0), 5);

        R.afficher();
        C.afficher();
        System.out.println("----------------------------------------");

        // Points à tester
        Point[] points = {
                new Point(2, 2),
                new Point(5, 4),
                new Point(6, 1),
                new Point(3, 4),
                new Point(0, 5)
        };

        for (Point p : points) {
            System.out.print("Point ");
            p.afficher();

            boolean dansR = R.contient(p);
            boolean dansC = C.contient(p);

            System.out.println(" -> Dans Rectangle ? " + (dansR ? "Oui" : "Non")
                    + " | Dans Cercle ? " + (dansC ? "Oui" : "Non"));
        }
    }
}