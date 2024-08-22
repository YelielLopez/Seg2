/*
package Cine;
import javax.swing.*;
public class Arle {
    public class Persona{
        private String nombre;
        private String direccion;
        private int id;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Persona(String nombre, String direccion, int id) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.id = id;
        }
    }

    public class Cliente extends Persona{
        private String historialReservas;

        public String getHistorialReservas() {
            return historialReservas;
        }

        public void setHistorialReservas(String historialReservas) {
            this.historialReservas = historialReservas;
        }

        public Cliente(String nombre, String direccion, int id, String historialReservas) {
            super(nombre, direccion, id);
            this.historialReservas = historialReservas;
        }
    }
    public class Funcion{
        private String Pelicula;
        private float costo;
        private int sala;
        private int horaInicio;

        public String getPelicula() {
            return Pelicula;
        }

        public void setPelicula(String pelicula) {
            Pelicula = pelicula;
        }

        public float getCosto() {
            return costo;
        }

        public void setCosto(float costo) {
            this.costo = costo;
        }

        public int getSala() {
            return sala;
        }

        public void setSala(int sala) {
            this.sala = sala;
        }

        public int getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(int horaInicio) {
            this.horaInicio = horaInicio;
        }

        public Funcion(String pelicula, float costo, int sala, int horaInicio) {
            Pelicula = pelicula;
            this.costo = costo;
            this.sala = sala;
            this.horaInicio = horaInicio;
        }
    }
    public class Sala{
        private String fila;
        private String columna;
        private String estado;

        public String getFila() {
            return fila;
        }

        public void setFila(String fila) {
            this.fila = fila;
        }

        public String getColumna() {
            return columna;
        }

        public void setColumna(String columna) {
            this.columna = columna;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public Sala(String fila, String columna, String estado) {
            this.fila = fila;
            this.columna = columna;
            this.estado = estado;
        }

        public class Reserva{
            private int funcion;
            private String Cliente;
            private String listaAsientos;

            public int getFuncion() {
                return funcion;
            }

            public void setFuncion(int funcion) {
                this.funcion = funcion;
            }

            public String getCliente() {
                return Cliente;
            }

            public void setCliente(String cliente) {
                Cliente = cliente;
            }

            public String getListaAsientos() {
                return listaAsientos;
            }

            public void setListaAsientos(String listaAsientos) {
                this.listaAsientos = listaAsientos;
            }

            public Reserva(String listaAsientos, String cliente, int funcion) {
                this.listaAsientos = listaAsientos;
                Cliente = cliente;
                this.funcion = funcion;
            }
            String VerDisponibilidad(){
                return 
            }
        }

        public static void main(String[]args){
            int recaudo=0;
            int recaudo2=0;

            */
/*public String verDisponibilidad(){

                return;
            }*//*

            boolean check=true;
            int Opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Elija: \n\t 1.Ver Disponibilidad"+*/
/*Comprar Boletos*//*
 "\n\t 2. Reservar Asiento \n\t 3.Ver Ocupacion Sala \n\t 4.Salir"));
            switch (Opcion){
                case 1:
                    VerDisponibilidad();
                    break;
                case 2:

                    break;
            }
        }
    }
    */
/*
    <script>


let check = true

  switch (opcion) {
    case "1":
      verDisponibilidad();
      break;

    case "2":
      reservarAsiento();
      break;

    case "3":
      verPelicula();
      break;

    case "4":
      verBalance();
      break;

    case "5":
      alert("¡Hasta luego!");
      check = !check

      break;


    default:
      alert("Opción no válida. Intenta de nuevo.");
  }
const sala1 = Array(10).fill(false);
const sala2 = Array(10).fill(false);
const valorEntrada = 5000
let recaudo1 = 0
let recaudo2 = 0



function verDisponibilidad() {                   //Funcion sin parametros que utiliza un map para mostrar los asientos disponibles en forma de lista en las salas correspondientes
  alert("Sala 1:");
  alert(sala1.map((asiento, i) => asiento ? `[X] Asiento ${i + 1}` : `[ ] Asiento ${i + 1}`).join("\n"));
  alert("Sala 2:");
  alert(sala2.map((asiento, i) => asiento ? `[X] Asiento ${i + 1}` : `[ ] Asiento ${i + 1}`).join("\n"));
}

function reservarAsiento() {                    //Funcion sin parametros que solicita al usuario el numero de sala y asiento que desee reservar y despues el asiento se tacha en la lista
  const sala = prompt("Ingresa el número de la sala (1 o 2)");
  const asiento = parseInt(prompt("Ingresa el número del asiento (1 a 10)")) - 1;

  if (sala === "1" && !sala1[asiento]) {
    sala1[asiento] = true;
    recaudo1 += valorEntrada
    alert(`Asiento ${asiento + 1} de la sala 1 reservado.`);

  } else if (sala === "2" && !sala2[asiento]) {
    sala2[asiento] = true;
    recaudo2 += valorEntrada
    alert(`Asiento ${asiento + 1} de la sala 2 reservado.`);
  } else {
    alert("El asiento ya está reservado o la sala no es válida.");
  }
}

let total = recaudo1 + recaudo2

function verPelicula() {                                 //Funcion para determinar cuantos asientos hay disponibles en cada sala y saber si se puede entrar o no
  const sala = prompt("Ingresa el número de la sala (1 o 2)");
  const asientosLibres = sala === "1" ? sala1.filter(asiento => !asiento) : sala2.filter(asiento => !asiento);

  if (asientosLibres.length > 0) {
    alert(`Hay ${asientosLibres.length} asientos libres en la sala ${sala}.`);
    alert("Disfrutad de la película!");
  } else {
    alert(`Lo siento, todos los asientos de la sala ${sala} están reservados.`);
  }
}



let verBalance = () => {
  alert(`Total recaudado en la sala 1 es de un total de ${recaudo1} \n total recaudado en la sala 2 es de un total de ${recaudo2} \n El total recaudado en las 2 salas es de un total de ${recaudo1 + recaudo2} `)


}
}
    * *//*

}
*/
