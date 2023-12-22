

package gm.recursoshumanos.repositororio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.recursoshumanos.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {
    
}