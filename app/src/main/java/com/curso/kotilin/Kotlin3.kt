package com.curso.kotilin

fun main(){
    val generi = Generica<Int>(3)
    ciclos();
}


class Generica<T>(val item:T){

    fun getElement():T{
        return item
    }
}


fun ciclos(){
    val list = listOf("uno","dos","tres")

    var contador = 0

    for (item in list){
        println("item: $item")
    }

    while (contador < list.size){
        println(list.get(contador))
        contador++
    }

    contador =0

    do {
        println(list.get(contador))
        contador++
    }while (contador < list.size)

    for (item in 1..3){
        println(item)
    }

    for(item in 1..30 step 3){
        println(item)
    }
}



