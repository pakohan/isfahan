package com.github.pakohan.isfahan.app

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.github.pakohan.isfahan.R

class MainActivity : AppCompatActivity() {
    val textAreaState = mutableStateOf("")
    val textFieldState = mutableStateOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var textArea by textAreaState
        var textField by textFieldState

        textArea = getString(R.string.hello)
        setContent {
            Column {
                Text(text = textArea)
                TextField(
                    value = textField,
                    onValueChange = { textField = it },
                    label = { Text("Label") }
                )
                Button(onClick = { textArea = textField }) { Text("Click!") }
            }
        }
    }
}
