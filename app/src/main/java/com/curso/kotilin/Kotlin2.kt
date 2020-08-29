package com.curso.kotilin

fun main(){
    printNombre("francisco","mora",32)
    printPrefix("francisco")
    suma(1,2)
    multiplicacion(4,9)

    "francisco".saludo()
}

fun printNombre(nombre:String,apellido:String,edad:Int){
    println("Mi nombre es $nombre $apellido edad: $edad")
}

fun printPrefix(nombre:String ,prefix:String = "estudiante"  ){
    println("$prefix:  $nombre")
}

fun suma(num1:Int,num2:Int):Int{
    return num1 +num2
}

fun multiplicacion(num1: Int, num2: Int): Int{
    return num1 * num2
}

fun multiPrint(vararg message:String, prefix: String){
    for (m  in message) println("$prefix: $m ")
}

fun String.saludo(){
    println("saludo $this")
}

fun String.despedida(){
    println("despedida a $this")
}

open class Dog(){
    open fun  makeNoise(){
        println("wow wow")
    }
}

class Yorkshire:Dog(){
    override fun makeNoise() {
        println("wif wif")
    }
}