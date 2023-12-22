package gm.recursoshumanos.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gm.recursoshumanos.modelo.Empleado;
import gm.recursoshumanos.servicio.IEmpleadoServicio;

@RestController
//http://localhost:8081/recursoshumanos-app/
@RequestMapping("recursoshumanos-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoControlador {
    
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados(){
        var empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
        
    }
    @PostMapping("/empleados")
        public Empleado agregarEmpleado(@RequestBody Empleado empleado){
            logger.info("Empleado a agregar"+ empleado);
            return empleadoServicio.guardarEmpleado(empleado);
        }
    }

  