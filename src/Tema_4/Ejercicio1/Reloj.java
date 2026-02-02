package Tema_4.Ejercicio1;

import java.awt.desktop.AboutEvent;

public class Reloj {
    private int hora;
    int min;
    int seg;
    boolean formato24;

    public void Reloj(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public void Reloj(){
        this.hora = 00;
        this.min = 00;
        this.seg = 00;
    }


    public int getHora(){return hora;}
    public void setHora(){
        if (hora < 24 && hora > 0){
            this.hora = hora;
        }
    }

    public int getMin(){return min;}
    public void setMin(){
        if (min < 60 && min > 0){
            this.min = min;
        }
    }

    public int getSeg(){return seg;}
    public void setSeg(){
        if (seg < 60 && seg > 0){
            this.seg = seg;
        }
    }

    public boolean getFormato24(){return formato24;}
    public void setFormato24(){this.formato24 = formato24;}


    public String toString() {
        if(formato24) {
            return "Son las " + hora + ":" + min + ":" + seg;
        } else{
            if (hora > 12) {
                hora = hora - 12;
                return "Son las " + hora + ":" + min + ":" + seg + " pm";
            }else {
                return "Son las " + hora + ":" + min + ":" + seg + " am";
            }
        }
    }

   /* public void mostrarHora(int hora, int min, int seg, boolean formato24){
        if(formato24) {
            System.out.println("Son las " + hora + ":" + min + ":" + seg);
        } else{
            if (hora > 12) {
                hora = hora - 12;
                System.out.println("Son las " + hora + ":" + min + ":" + seg + " pm");
            }else {
                System.out.println("Son las " + hora + ":" + min + ":" + seg + " am");
            }
        }
    }*/
}
