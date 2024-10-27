package com.matheus.repository;

import com.matheus.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
