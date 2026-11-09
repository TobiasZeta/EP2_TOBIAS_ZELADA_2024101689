/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

import org.springframework.stereotype.Controller;

/**
 *
 * @author laboratorioasu
 */
@Controller
public class SaludoController {
    public String mostrar() {
        return "saludo";
    }
}
