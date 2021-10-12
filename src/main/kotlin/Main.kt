
const val PI = 3.14
const val apple = 50

fun main(args: Array<String>) {
  /*  println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    //println("Program arguments: ${args.joinToString()}")

    var light: String = "yellow"
/*
    if (light == "green"){
        println("go")
    }else if (light == "yellow"){
        println("ready")
    }else if(light == "red"){
      println("stop")
    }
*/
    // -------------------------------------------------------------------

    // var print:String= if(light == "green") "Go!" else if(light == "yellow") "be careful" else


    var prent:String = if (light == "green") {
            "go"
        } else if (light == "yellow") {
            "ready"
        }  else  if (light == "red"){
            "stop"
        }else {
        "cution"
    }
    println(prent)

    // --------------------------------------------------------------------

    when(light){
        "green" -> println("go")
        "yellow" -> println("ready")
        "red" -> println("stop")
        else -> println("custion")
    }

    // --------------------------------------------------------------------

    var name : String = "Nawal"
    var age : Int = 9

    println("Hello my name is $name and my age is $age")
*/

    var numofdozen = apple / 12
            println(numofdozen)

    var reminapple = apple % 12
    // % modelos باقي القسمة

    // var num = 12 * numofdozen

    // var reminapple = apple - num
    println(reminapple)


}