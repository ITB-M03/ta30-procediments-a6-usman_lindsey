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

    @Test
    fun checkReservarAsientosBasico() {
        val sala = mutableListOf(
            mutableListOf("(_)", "(_)", "(_)", "(_)"),
            mutableListOf("(_)", "(_)", "(_)", "(_)"),
            mutableListOf("(_)", "(_)", "(_)", "(_)")
        )

        reservarAsientos(sala, 1, 2) // Reservar asiento en la fila 1, columna 2

        assertEquals("(X)", sala[1][2]) // Verificar que el asiento ha sido actualizado a "(X)"
    }



}