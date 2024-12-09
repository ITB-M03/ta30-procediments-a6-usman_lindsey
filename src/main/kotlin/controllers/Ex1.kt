package org.example.controllers

/*
Aquest exercici té com a objectiu construir una sèrie de funcions per efectuar transformacions sobre punts en el pla.
Els punts són del tipus data class Punt, definit així:
data class Punt (
    var x: Float,
    var y: Float
)
*/

data class Punt(
    var x: Float,
    var y: Float
)

/**
 * Programa principal que demostra l'ús de diverses funcions per transformar punts.
 * Inclou mostrar un punt, traslladar-lo, escalar-lo i comprovar si dos punts són iguals.
 *
 * @author Usman Rashid Parveen
 * @since 08 / 12 / 2024
 *
 */
fun main() {
    val puntInicial = Punt(2.0f, 0.2f)

    // 1.1. Mostrar punt inicial
    println("1.1. Punt inicial:")
    mostraPunt(puntInicial)

    // 1.2. Translació del punt
    val desplacament = Punt(1.0f, 2.0f)
    translaccio(puntInicial, desplacament)
    println("\n1.2. Punt després de la translació:")
    mostraPunt(puntInicial)

    // 1.3. Escalat del punt
    val factorEscala = 1.5f
    escalat(puntInicial, factorEscala)
    println("\n1.3. Punt després de l'escalat:")
    mostraPunt(puntInicial)

    // 1.4. Comprovar si dos punts són iguals
    val puntIgual = Punt(3.0f, 4.0f)
    println("\n1.4. Els punts són iguals? ${puntsIguals(puntInicial, puntIgual)}")
}

/**
 * Mostra les coordenades d'un punt amb format (x, y) amb 6 decimals.
 *
 * @author Usman Rashid Parveen
 * @since 08 / 12 / 2024
 *
 * @param p el punt a mostrar.
 */
fun mostraPunt(p: Punt) {
    println("(${"%.6f".format(p.x)}, ${"%.6f".format(p.y)})")
}

/**
 * Trasllada un punt segons un desplaçament donat.
 * Modifica el punt original sumant les coordenades del desplaçament.
 *
 * @author Usman Rashid Parveen
 * @since 08 / 12 / 2024
 *
 * @param p el punt a modificar.
 * @param desplacament el punt que defineix el desplaçament.
 */
fun translaccio(p: Punt, desplacament: Punt) {
    p.x += desplacament.x
    p.y += desplacament.y
}

/**
 * Escala un punt segons un factor donat.
 * Modifica el punt original multiplicant les seves coordenades pel factor.
 *
 * @author Usman Rashid Parveen
 * @since 08 / 12 / 2024
 *
 * @param p el punt a escalar.
 * @param factor el factor d'escala.
 */
fun escalat(p: Punt, factor: Float) {
    p.x *= factor
    p.y *= factor
}

/**
 * Comprova si dos punts són iguals.
 * Dos punts són iguals si tenen les mateixes coordenades (x, y).
 *
 * @author Usman Rashid Parveen
 * @since 08 / 12 / 2024
 *
 * @param p1 el primer punt.
 * @param p2 el segon punt.
 * @return `true` si els punts són iguals, altrament `false`.
 */
fun puntsIguals(p1: Punt, p2: Punt): Boolean {
    return p1.x == p2.x && p1.y == p2.y
}
