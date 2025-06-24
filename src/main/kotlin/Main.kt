package org.example

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val parts = IntArray(3)
    for (i in 0 until 3) {
        parts[i] = reader.readLine().toInt()
    }
    val sortedParts = parts.sorted()
    writer.write(sortedParts[1])

    reader.close()
    writer.close()
}