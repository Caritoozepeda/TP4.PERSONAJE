
//Crear
//un Guerrero de nombre “Thor” en la posición X=100, Y=200 
//b. Hacerlo girar hasta que mire al Oeste
//c. Hacerlo Avanzar 5 pasos.
//d. Hacerlo disparar 8 veces.

public class TestHerencia {

    public static void main(String[] args) {

        Position p1 = new Position(100, 200);
        Guerrero g1 = new Guerrero(p1, "Thor");
        
        

        System.out.println(" La ENERGIA INICIAL de " + g1.getNick() + "  es : " + g1.getEnergia());

        g1.getOrientacion();

        while (g1.getOrientacion() != 'O') {
            g1.girar();
        }

        char p = g1.getOrientacion();
        String pr = "";

        switch (p) {

            case 'N':
                pr = " Norte";
                break;
            case 'E':
                pr = " Este";
                break;
            case 'S':
                pr = " Sur";
                break;
            default:
                pr = " Oeste";
                break;
        }

        System.out.println(" " + g1.getNick() + " esta ORIENTADO hacia el " + pr);
////
        for (int i = 0; i < 5; i++) {
            g1.avanzar();

        }
        for (int i = 0; i < 8; i++) {

            g1.disparar();
        }

        System.out.println(" La energía FINAL es : " + g1.getEnergia() + " y su UBICACION es x : " + g1.ubicacion.getX() + " y: " + g1.ubicacion.getY());

        System.out.println("......................................................................");

//        Se crea un nuevo guerrero con caballo que debe avanzar hacia el Sur. Avanza 5 pasos y dispara 8 veces.
        Position p2 = new Position(100, 200);
        Guerrero g2 = new Guerrero(true, p2, "Haruka");

        System.out.println(" La ENERGIA INICIAL de " + g2.getNick() + " es : " + g2.getEnergia());

        g2.getOrientacion();

        while (g2.getOrientacion() != 'S') {
            g2.girar();
        }
        char t = g2.getOrientacion();
        String tr = "";

        switch (t) {

            case 'N':
                tr = " Norte";
                break;
            case 'E':
                tr = " Este";
                break;
            case 'S':
                tr = " Sur";
                break;
            default:
                tr = " Oeste";
                break;
        }

        System.out.println(" " + g2.getNick() + " esta ORIENTADO hacia el" + tr);

        for (int x = 0; x < 5; x++) {

            g2.avanzar();

        }
        for (int x = 0; x < 8; x++) {

            g2.disparar();

        }
        p2 = g2.getUbicacion();

        System.out.println(" La ENERGIA FINAL es : " + g2.getEnergia() + " y su UBICACION es x : " + p2.getX() + " y: " + p2.getY());

    }

}
