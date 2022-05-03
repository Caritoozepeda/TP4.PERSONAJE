
import java.util.Scanner;

abstract class Personaje {

    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'N';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void disparar() {
        if (energia > 0) {
            energia -= 10;

        } else {
            System.out.println("No tiene energía para disparar");
        }
    }

    public void girar() {

        char p = this.getOrientacion();

        switch (p) {

            case 'N':
                this.setOrientacion('E');
                System.out.println(" Giró hacia el : Este,");
                break;
            case 'E':

                this.setOrientacion('S');
                System.out.println(" Sur,");

                break;
            case 'S':
                this.setOrientacion('O');
                System.out.println(" Oeste,");

                break;
            case 'O':
                this.setOrientacion('N');
                System.out.println(" Norte,");

                break;
            default:
                break;

        }

        this.getUbicacion();

    }

    public void avanzar() {

        char r = this.getOrientacion();
        int x = this.ubicacion.getX();
        int y = this.ubicacion.getY();

        int pasos = 1;

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

    }

}
