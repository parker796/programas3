package com.example.programa3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.regex.Pattern;

@Controller
public class VerificarCorreoController {
    @PostMapping("/verificar-correo")
    @ResponseBody
    public String verificarCorreo(@RequestParam String correo) {
        // Expresión regular para verificar si es una dirección de correo válida
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        if (pattern.matcher(correo).matches()) {
            return "La dirección de correo es válida.";
        } else {
            return "La dirección de correo no es válida.";
        }
    }
}
