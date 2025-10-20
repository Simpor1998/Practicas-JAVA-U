package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    // los metodos los importo de la clase Snack en singular
    //por default seran publicos y abstractos pero no hay que especificar
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
