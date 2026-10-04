package com.example.studentgradeapp
data class Student(
    val name: String?,
    val score: Int
)

fun getGrade(score: Int): String = when {
    score >= 80 -> "A"
    score >= 70 -> "B"
    score >= 60 -> "C"
    else -> "D"
}

fun getStatus(score: Int): String =
    if (score >= 60) "Lulus" else "Tidak Lulus"

fun formatStudent(student: Student): String {
    val displayName = student.name ?: "Guest"

    return "$displayName | ${student.score} | ${getGrade(student.score)} | ${getStatus(student.score)}"
}

fun main() {
    val students = listOf(
        Student(name = "Andi", score = 90),
        Student(name = "Budi", score = 75),
        Student(name = null, score = 55)
    )

    students.forEach { student ->
        println(formatStudent(student))
    }
}