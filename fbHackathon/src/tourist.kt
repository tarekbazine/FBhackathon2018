/**
 * Created by Tarek BAZ on 07/07/2018.
 */
package tourist

import java.io.File

fun main(args:Array<String>){

    val fileName = "tourist_example_input.txt"

    val linesList = File(fileName).readLines()

//    print(linesList[0].toInt())

    var lineIndex = 1
    var str : List<String>
    var n = 0
    var k = 0
    var v = 0.0
    var attractionList = ArrayList<String>()

    var firstAttractionIndex = 0
    var selectedAttractionList = ArrayList<Int>()

//    val writer = File("tourist_output.txt").printWriter()
    val writer = File("tourist_output.txt")

    for(i in 0 until linesList[0].toInt()){
        str = linesList[lineIndex].split(' ')
        n = str[0].toInt()
        k = str[1].toInt()
        v = str[2].toDouble()


        ((lineIndex+1)..(lineIndex+n)).
                mapTo(attractionList) { linesList[it] }

//        print(attractionList)

        firstAttractionIndex = ( k * (v - 1) % n ).toInt()
        (0 until k).mapTo(selectedAttractionList) {
            (firstAttractionIndex+ it) % n
//            println(attractionList[(firstAttractionIndex+m) % n])
        }


        selectedAttractionList.sort()

        selectedAttractionList.forEach {
            it -> println(attractionList[it])
        }

//        writer.use {
//            out -> out.println("Case #$i:")
//        }
        writer.appendText("Case #${i+1}:")

        selectedAttractionList.forEach {
            it ->
            writer.appendText(" ${attractionList[it]}")
        }

        writer.appendText("\n")


//        print(" "+n +" "+ k +" "+ v)
        println("#")
        lineIndex += (n + 1)
        attractionList = ArrayList<String>()
        selectedAttractionList = ArrayList<Int>()
    }

//    File("tourist_output.txt").printWriter().use { out ->
//
//        history.forEach {
//            out.println("${it.key}, ${it.value}")
//        }
//    }

//    "Case #${}:"
//
}