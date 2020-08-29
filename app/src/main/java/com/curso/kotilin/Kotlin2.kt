package com.curso.kotilin

fun init(){
    printNombre("francisco","mora",32)
    printPrefix("francisco")
    suma(1,2)
    multiplicacion(4,9)
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

