
public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(Position ubicacion, String nick) {
        super(ubicacion, nick);
    }

    public Guerrero(boolean caballo, Position ubicacion, String nick) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }

    @Override
    public void disparar() {

        if (energia > 10) {
            energia -= 10;

        }
        if (energia < 30 && isCaballo()) {

            this.setCaballo(false);
            System.out.println(" Su energía es " + this.getEnergia() + " por lo tanto, ha PERDIDO EL CABALLO");
        }

    }

    public void avanzar() {

        char r = this.getOrientacion();
        int x = this.ubicacion.getX();
        int y = this.ubicacion.getY();

        if (isCaballo()) {
            int pasos = 10;

            switch (r) {

                case 'N':
                    y -= pasos;
                    break;
                case 'S':
                    y += pasos;
                    break;
                case 'E':
                    x += pasos;
                    break;
                case 'O':
                    x -= pasos;
                default:
                    break;

            }

            this.ubicacion.setX(x);
            this.ubicacion.setY(y);

            this.setUbicacion(ubicacion);

        } else {
            super.avanzar();
        }

    }

}
