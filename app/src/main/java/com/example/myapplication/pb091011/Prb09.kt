package com.example.myapplication.pb091011


fun packed(list: List<Char>): List<List<Char>> {

    var packedList: MutableList<MutableList<Char>> = mutableListOf()

    list.forEach { listItem ->

        when {
            packedList.isEmpty() -> {
                packedList.add(mutableListOf(listItem))
            }
            packedList.last().contains(listItem) -> {
                packedList.last().add(listItem)
            }
            else -> {
                packedList.add(mutableListOf(listItem))
            }
        }
    }
    return packedList
}

fun List<Char>.packedEF(): List<List<Char>> {

    return if (this.isEmpty()) {
        emptyList()
    } else {
        var packedList = this.takeWhile { element ->
            this.first() == element
        }
        listOf(packedList) + this.drop(packedList.size).packedEF()
    }
}


fun main() {
    val input = "faaaabccaadeeee".toList()
    println(" Input list: $input ")

    //pb9
    val resultList = packed(input)
    println(" \n Pb9 (*) Pack consecutive duplicates of list elements into sublists: \n $resultList,")

    println(input.packedEF())

}