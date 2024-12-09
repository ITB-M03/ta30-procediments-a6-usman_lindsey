package org.example.controllers

import java.util.*

fun main() {
    var scan = abrirScanner()
    var menu = menu(scan)
    var sala = crearSala()
    while (menu != 4){
        if (menu == 1){
            vaciarLista(sala)
        }
        else if(menu == 2){
            mostrarSala(sala)
        }
        else if(menu == 3){
            print("Introduce la fila: ")
            var fila = scan.nextInt()
            print("Introduce la butaca: ")
            var butaca = scan.nextInt()
            reservarAsientos(sala,fila,butaca)
        }
        menu = menu(scan)
    }
    cerrarScanner(scan)
}
/** Funcion que muestra el menu de opciones
 * @author Lindsey Antunez
 * @version 1.0
 * @return seleccion guarda la opcion que el usuario eligio
 * A esta funcion no se le hacen tests ya que necesita que se introduzcan datos por teclado
 */
fun menu(scan:Scanner):Int {
    var seleccion : Int
    print("""
        *** Menu de opciones ***
      
        1. Vaciar la sala
        2. Ver asientos disponibles
        3. Reservar asientos
        4. Salir
        
        Seleccione la opcion que desee realizar:
    """.trimIndent())
    seleccion = scan.nextInt()
    return seleccion
}
/**funcion que guarda la matriz que equivale a la sala
 * @author Lindsey Antunez
 * @version 1.0
 * @return lista lista de los asientos de la sala
 * @param fila numero de filas que tendra la matriz
 * @param butacas numero de butacas que tiene cada fila
 *
 */
fun crearSala(): MutableList<MutableList<String>>{
    var lista: MutableList<MutableList<String>>
    lista = mutableListOf()

    var fila = 20
    var butacas = 15

    for (i in 0 until fila) {
        var fila: MutableList<String> = mutableListOf()
        for (it in 0 until butacas) {
            fila.add(it, "(_)")
        }
        lista.add(i, fila)
    }
    return lista
}

/**Funcion que vacia la sala
 * @author Lindsey Antunez
 * @version 1.0
 * @return lista contiene la lista modificada con todos los asientos disponibles
 */
fun vaciarLista(lista:MutableList<MutableList<String>>){
    for(i in 0 until lista.size) {
        for(j in 0 until lista[i].size) {
            lista[i][j] = "(_)"
        }
    }
}
fun mostrarSala(lista:MutableList<MutableList<String>>){
    for(i in 0 until lista.size) {
        for(j in 0 until lista[i].size) {
            print("${lista[i][j]}")
        }
        println()
    }
}

fun reservarAsientos(sala: MutableList<MutableList<String>>, fila:Int, butaca:Int){
    if (fila < sala.size && butaca < sala[fila].size && fila >= 0 && butaca >= 0) {
        sala[fila][butaca] = "(X)"
    }
}


/**
 * Funcion que abre el scanner
 * @author Lindsey Antunez
 * @version 1.0
 * @param scan Scanner
 */
fun abrirScanner() : Scanner {
    var scan : Scanner = Scanner(System.`in`)
    return scan
}
/**
 * Funcion que cierra el scanner
 * @author Lindsey Antunez
 * @version 1.0
 */
fun cerrarScanner(scan: Scanner) {
    scan.close()
}