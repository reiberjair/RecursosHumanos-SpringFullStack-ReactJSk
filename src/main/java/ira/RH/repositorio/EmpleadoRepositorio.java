package ira.RH.repositorio;

import ira.RH.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
