package gm.recursoshumanos.servicio;

import java.util.List;

import gm.recursoshumanos.modelo.Empleado;

public interface IEmpleadoServicio {

    public List<Empleado>listarEmpleados();
    public Empleado buscarEmpleadoporId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
