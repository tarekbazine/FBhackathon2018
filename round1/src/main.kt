/**
 * Created by Tarek BAZ on 22/07/2018.
 */
package tourist

import java.io.File

fun main(args: Array<String>) {

    val fileName = "tourist.txt"

    val linesList = File(fileName).readLines()

    var lineIndex = 1
    var str: List<String>
    var n = 0
    var k = 0
    var v = 0.0
    var attractionList = ArrayList<String>()

    var firstAttractionIndex = 0
    var selectedAttractionList = ArrayList<Int>()

    val writer = File("tourist_output.txt")

    for (i in 0 until linesList[0].toInt()) {
        str = linesList[lineIndex].split(' ')
        n = str[0].toInt()
        k = str[1].toInt()
        v = str[2].toDouble()


        ((lineIndex + 1)..(lineIndex + n)).
                mapTo(attractionList) { linesList[it] }

        firstAttractionIndex = (k * (v - 1) % n).toInt()
        (0 until k).mapTo(selectedAttractionList) {
            (firstAttractionIndex + it) % n
        }


        selectedAttractionList.sort()

        writer.appendText("Case #${i + 1}:")

        selectedAttractionList.forEach {
            it ->
            writer.appendText(" ${attractionList[it]}")
        }

        writer.appendText("\n")


        lineIndex += (n + 1)
        attractionList = ArrayList<String>()
        selectedAttractionList = ArrayList<Int>()
    }

    print("==> bOoM")
}

class Cell(posX: Int, posY: Int, isBlocked: Boolean, pipeType: Int) {
    companion object {
        val TOP_LEFT = 1
        val TOP_RIGHT = 2
        val BOTTOM_LEFT = 3
        val BOTTOM_RIGHT = 4
    }

}