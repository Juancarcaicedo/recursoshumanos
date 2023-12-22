package gm.recursoshumanos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.recursoshumanos.modelo.Empleado;
import gm.recursoshumanos.repositororio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
       return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoporId(Integer idEmpleado) {
        Empleado empleado= empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
       return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
     empleadoRepositorio.delete(empleado);
    }

    
}