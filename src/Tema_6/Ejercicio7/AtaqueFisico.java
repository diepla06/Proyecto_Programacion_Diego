package Tema_6.Ejercicio7;

public class AtaqueFisico implements IAtaque {
        private String nombre;
        private double puntosDanyo;
        private double energiaRequerida;


        public AtaqueFisico() {}


        public AtaqueFisico(String nombre, double puntosDanyo, double energiaRequerida) {
            this.nombre = nombre;
            this.puntosDanyo = puntosDanyo;
            this.energiaRequerida = energiaRequerida;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public double getPuntosDanyo() { return puntosDanyo; }
        public void setPuntosDanyo(double puntosDanyo) { this.puntosDanyo = puntosDanyo; }
        public double getEnergiaRequerida() { return energiaRequerida; }
        public void setEnergiaRequerida(double energiaRequerida) { this.energiaRequerida = energiaRequerida; }

        @Override
        public void lanzar() {
            System.out.println("Ejecutando ataque físico: " + nombre);
        }

        @Override
        public double coste() {
            return energiaRequerida;
        }

        @Override
        public double danyoInfligido() {
            return 0;
        }

}

