package controllers

import org.example.controllers.Punt
import org.example.controllers.escalat
import org.example.controllers.puntsIguals
import org.example.controllers.translaccio
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Ex1KtTest {

  // Tests para mostraPunt
  @Test
  fun checkMostraPuntCasoBasico() {
   val punt = Punt(2.0f, 0.2f)
   val expected = "(2,000000, 0,200000)"
   assertEquals(expected, "(${("%.6f".format(punt.x))}, ${("%.6f".format(punt.y))})")
  }

  @Test
  fun checkMostraPuntValoresNegativos() {
   val punt = Punt(-1.5f, -3.2f)
   val expected = "(-1,500000, -3,200000)"
   assertEquals(expected, "(${("%.6f".format(punt.x))}, ${("%.6f".format(punt.y))})")
  }

  @Test
  fun checkMostraPuntValoresCero() {
   val punt = Punt(0.0f, 0.0f)
   val expected = "(0,000000, 0,000000)"
   assertEquals(expected, "(${("%.6f".format(punt.x))}, ${("%.6f".format(punt.y))})")
  }

  // Tests para translaccio
  @Test
  fun checkTranslaccioDesplazamientoPositivo() {
   val punt = Punt(1.0f, 1.0f)
   translaccio(punt, Punt(2.0f, 3.0f))
   assertEquals(3.0f, punt.x)
   assertEquals(4.0f, punt.y)
  }

  @Test
  fun checkTranslaccioDesplazamientoNegativo() {
   val punt = Punt(1.0f, 1.0f)
   translaccio(punt, Punt(-1.0f, -1.0f))
   assertEquals(0.0f, punt.x)
   assertEquals(0.0f, punt.y)
  }

  @Test
  fun checkTranslaccioDesplazamientoCero() {
   val punt = Punt(1.0f, 1.0f)
   translaccio(punt, Punt(0.0f, 0.0f))
   assertEquals(1.0f, punt.x)
   assertEquals(1.0f, punt.y)
  }

  // Tests para escalat
  @Test
  fun checkEscalatFactorPositivo() {
   val punt = Punt(2.0f, 3.0f)
   escalat(punt, 2.0f)
   assertEquals(4.0f, punt.x)
   assertEquals(6.0f, punt.y)
  }

  @Test
  fun checkEscalatFactorNeutro() {
   val punt = Punt(2.0f, 3.0f)
   escalat(punt, 1.0f)
   assertEquals(2.0f, punt.x)
   assertEquals(3.0f, punt.y)
  }

  @Test
  fun checkEscalatFactorCero() {
   val punt = Punt(2.0f, 3.0f)
   escalat(punt, 0.0f)
   assertEquals(0.0f, punt.x)
   assertEquals(0.0f, punt.y)
  }

  // Tests para puntsIguals
  @Test
  fun checkPuntsIgualsSonIguales() {
   val punt1 = Punt(1.0f, 1.0f)
   val punt2 = Punt(1.0f, 1.0f)
   assertEquals(true, puntsIguals(punt1, punt2))
  }

  @Test
  fun checkPuntsIgualsNoSonIguales() {
   val punt1 = Punt(1.0f, 1.0f)
   val punt2 = Punt(2.0f, 2.0f)
   assertEquals(false, puntsIguals(punt1, punt2))
  }

  @Test
  fun checkPuntsIgualsCoordenadasDiferentes() {
   val punt1 = Punt(1.0f, 1.0f)
   val punt2 = Punt(1.0f, 2.0f)
   assertEquals(false, puntsIguals(punt1, punt2))
  }
}