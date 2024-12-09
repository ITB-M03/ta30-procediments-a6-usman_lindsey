package controllers

import org.example.controllers.crearSala
import org.example.controllers.reservarAsientos
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Ejercicio_2KtTest {

    @Test
    fun reservarAsientosFunciona() {
        var esperado = "(X)"
        var sala = crearSala()
        assertEquals(esperado, reservarAsientos(sala,0,3 ))
    }




}