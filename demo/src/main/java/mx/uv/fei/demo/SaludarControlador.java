package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SaludarControlador {
    String nombre;

    @GetMapping("/saludos")
    public String saludar(){
        nombre();
        return "hola mundo! " + nombre;
    }

    @GetMapping("/despedidas")
    public String despedirse(){
        return "adios mundo!";
    }

    @PostMapping("/nombramientos")
    public void nombre(){
        nombre="Erik";
    }

    @PutMapping("/nombramientos")
    public void met1(){
        nombre = "nombre actualizar";
    }

    @DeleteMapping("/nombramientos")
    public void met2(){
        nombre = "";
    }


}