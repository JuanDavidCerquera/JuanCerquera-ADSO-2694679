/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composiscion;

/**
 *
 * @author juan
 */
class CocheController {
    private Coche modeloCoche;
    private CocheView vistaCoche;

    public Coche getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(Coche modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public CocheView getVistaCoche() {
        return vistaCoche;
    }

    public void setVistaCoche(CocheView vistaCoche) {
        this.vistaCoche = vistaCoche;
    }

    public CocheController(Coche modeloCoche, CocheView vistaCoche) {
        this.modeloCoche = modeloCoche;
        this.vistaCoche = vistaCoche;
    }

    public void arrancarCoche() {
        modeloCoche.arrancar();
        vistaCoche.imprimirDetallesCoche(modeloCoche.getMarca(), modeloCoche.getModelo());
        vistaCoche.imprimirEstadoMotor("Encendido");
    }

    public void detenerCoche() {
        modeloCoche.detener();
        vistaCoche.imprimirDetallesCoche(modeloCoche.getMarca(), modeloCoche.getModelo());
        vistaCoche.imprimirEstadoMotor("Apagado");
    }
}
