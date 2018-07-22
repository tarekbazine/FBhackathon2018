/**
 * Created by Tarek BAZ on 22/07/2018.
 */

package Let_It_Flow

import java.io.File

fun main(args: Array<String>) {

    val fileName = "let_it_flow_sample_input.txt"

    val linesList = File(fileName).readLines()

    var house = ArrayList<Cell>()
    var lineIndex = 1
    var n = 0
//    var x=0
//    var y=0
    var char = ' '


    for (i in 0 until linesList[0].toInt()) {
        n = linesList[lineIndex].toInt()

//        x=0
//        y=0
        for (y in 0 until 3)
            for (x in 0 until n) {
                char = linesList[lineIndex + y + 1][x]
                house.add(Cell(x, y, (char == '#')))
            }

        println(house)

        println(n)
        lineIndex += 4
        house = ArrayList<Cell>()
    }


//    var lineIndex = 1
//    var str: List<String>
////    var n = 0
//    var k = 0
//    var v = 0.0
//    var attractionList = ArrayList<String>()
//
//    var firstAttractionIndex = 0
//    var selectedAttractionList = ArrayList<Int>()
//
//    val writer = File("tourist_output.txt")
//
//    for (i in 0 until linesList[0].toInt()) {
//        str = linesList[lineIndex].split(' ')
//        n = str[0].toInt()
//        k = str[1].toInt()
//        v = str[2].toDouble()
//
//
//        ((lineIndex + 1)..(lineIndex + n)).
//                mapTo(attractionList) { linesList[it] }
//
//        firstAttractionIndex = (k * (v - 1) % n).toInt()
//        (0 until k).mapTo(selectedAttractionList) {
//            (firstAttractionIndex + it) % n
//        }
//
//
//        selectedAttractionList.sort()
//
//        writer.appendText("Case #${i + 1}:")
//
//        selectedAttractionList.forEach {
//            it ->
//            writer.appendText(" ${attractionList[it]}")
//        }
//
//        writer.appendText("\n")
//
//
//        lineIndex += (n + 1)
//        attractionList = ArrayList<String>()
//        selectedAttractionList = ArrayList<Int>()
//    }

    print("==> bOoM")
}

class Cell(val posX: Int, val posY: Int, val isBlocked: Boolean, var pipeType: Int = 0) {
    companion object {
        val TOP_LEFT = 1
        val TOP_RIGHT = 2
        val BOTTOM_LEFT = 3
        val BOTTOM_RIGHT = 4
    }


    override fun toString(): String {
        return if (isBlocked) "#" else "."
    }
}
