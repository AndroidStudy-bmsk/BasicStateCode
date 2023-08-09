package org.bmsk.basicstatecode.data

class WellnessRepository {

    fun getWellnessTasks() = List(30) { i ->
        WellnessTask(i, "Task # $i")
    }
}