
package com.example.studentgradeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val student = Student(name = "Andi", score = 90)
        val result = formatStudent(student)

        setContent {
            Text(result)
        }
    }
}