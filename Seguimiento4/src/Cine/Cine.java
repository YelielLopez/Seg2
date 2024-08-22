package Cine;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    public class Persona {
        private String nombre;
        private String direccion;
        private int id;

        public Persona(String nombre, String direccion, int id) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.id = id;
        }

        public String obtenerNombre() {
            return nombre;
        }

        public String obtenerDireccion() {
            return direccion;
        }

        public int obtenerId() {
            return id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public class Cliente extends Persona {
        private List<Reserva> historialReservas;

        public Cliente(String nombre, String direccion, int id) {
            super(nombre, direccion, id);
            this.historialReservas = new ArrayList<>();
        }

        public List<Reserva> obtenerHistorialReservas() {
            return historialReservas;
        }

        public void agregarReserva(Reserva reserva) {
            historialReservas.add(reserva);
        }
    }

    public class Asiento {
        private int fila;
        private int columna;
        private String estado; // "disponible", "reservado", "ocupado"

        public Asiento(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
            this.estado = "disponible";
        }

        public int obtenerFila() {
            return fila;
        }

        public int obtenerColumna() {
            return columna;
        }

        public String obtenerEstado() {
            return estado;
        }

        public void reservar() {
            if (estado.equals("disponible")) {
                estado = "reservado";
            }
        }

        public void ocupar() {
            if (estado.equals("reservado")) {
                estado = "ocupado";
            }
        }
    }

    public class Sala {
        private int numero;
        private int capacidad;
        private Asiento[][] listaAsientos;

        public Sala(int numero, int filas, int columnas) {
            this.numero = numero;
            this.capacidad = filas * columnas;
            listaAsientos = new Asiento[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    listaAsientos[i][j] = new Asiento(i, j);
                }
            }
        }

        public int obtenerNumero() {
            return numero;
        }

        public int obtenerCapacidad() {
            return capacidad;
        }

        public Asiento obtenerAsiento(int fila, int columna) {
            if (fila >= 0 && fila < listaAsientos.length && columna >= 0 && columna < listaAsientos[0].length) {
                return listaAsientos[fila][columna];
            }
            return null; // Asiento no válido
        }

        public Asiento[][] obtenerSala() {
            return listaAsientos;
        }

        public String verDisponibilidad() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < listaAsientos.length; i++) {
                for (int j = 0; j < listaAsientos[i].length; j++) {
                    Asiento asiento = listaAsientos[i][j];
                    sb.append("Fila ").append(asiento.obtenerFila()).append(", Columna ").append(asiento.obtenerColumna())
                            .append(": ").append(asiento.obtenerEstado()).append("\n");
                }
            }
            return sb.toString();
        }
    }

    public class Funcion {
        private String pelicula;
        private float horaInicio;
        private Sala sala;
        private float precioEntrada;

        public Funcion(String pelicula, float horaInicio, Sala sala, float precioEntrada) {
            this.pelicula = pelicula;
            this.horaInicio = horaInicio;
            this.sala = sala;
            this.precioEntrada = precioEntrada;
        }

        public String obtenerPelicula() {
            return pelicula;
        }

        public float obtenerHoraInicio() {
            return horaInicio;
        }

        public Sala obtenerSala() {
            return sala;
        }

        public float obtenerPrecioEntrada() {
            return precioEntrada;
        }
    }

    public class Reserva {
        private Cliente cliente;
        private Funcion funcion;
        private List<Asiento> listaAsientos;

        public Reserva(Cliente cliente, Funcion funcion, List<Asiento> listaAsientos) {
            this.cliente = cliente;
            this.funcion = funcion;
            this.listaAsientos = listaAsientos;
        }

        public Cliente obtenerCliente() {
            return cliente;
        }

        public Funcion obtenerFuncion() {
            return funcion;
        }

        public List<Asiento> obtenerListaAsientos() {
            return listaAsientos;
        }
    }
}