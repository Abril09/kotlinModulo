package com.curso.kotilin


fun main(){
    println(imprimiendoParametros("num1","mamam"))
    println(obtieneIva())
}

fun ejercicio_1y_2(name:String,prefix:String ="Mi nombre es" ){
    println("$prefix $name")
}

fun ejercicio_3_y_4(){
    val num1:Int =10
    val num2:Int =20
    val num3:Int =30
    println("total ="+ (num1+num2+num3) )
}

fun ejercicio_5__6_y_7(){
    val string:String ="Ark Reigen"
    var char:Char ='A'
    println("total cacteres="+ string.length)
    char = 'B'
}

fun ejercicio_8_y_9(){
    val float:Float = 0.2F
}

fun ejercicio_10(){
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
}

fun ejercicio_11(){
    println(Int.MIN_VALUE)
    println(Long.MIN_VALUE)
}

fun ejercicio_12(){
    val boolean:Boolean = true
    println(boolean)
}

fun imprimiendoParametros(param1:String ,param2:String):Int{
    return (param1.length+param2.length)
}

fun obtieneIva():Double{
    return 0.19
}

