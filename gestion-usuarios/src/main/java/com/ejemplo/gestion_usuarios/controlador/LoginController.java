package com.ejemplo.gestion_usuarios.controlador;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Muestra la vista login.html
    }

  

    @GetMapping("/redirect")
    public String redireccionPorRol(Authentication auth) {
        if (auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            return "redirect:/admin";
        } else {
            return "redirect:/home";
        }
    }

    @GetMapping("/admin")
    public String admin(Authentication auth) {
        if (auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            return "admin";
        }
        return "redirect:/access-denied";
    }
    @GetMapping("/admin-panel")
    public String adminPanel(Authentication auth) {
        if (auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            return "admin-panel";
        }
        return "redirect:/access-denied";
    }
    @GetMapping("/home")
    public String home() {
        return "home"; // Vista simple para usuarios normales
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied"; // Página de acceso denegado
    }
  
}


