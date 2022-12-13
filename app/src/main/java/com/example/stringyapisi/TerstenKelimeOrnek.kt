package com.example.stringyapisi

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    println("Kelime giriniz:")

    val kelime = girdi.next()

    //ahmet : a→0 , h→1,m→2 e→3 t→4  indeksler sırasıyla
    //4 3 2 1 0 →temha

    for (i in kelime.length-1 downTo 0){
        print(kelime[i])
    }
}