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
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth

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
                Text(
                    text = textArea,
                    modifier = Modifier.fillMaxWidth().weight(1F),
                )
                TextField(
                    value = textField,
                    modifier = Modifier.fillMaxWidth(),
                    onValueChange = { textField = it },
                    label = { Text("Label") }
                )
                Button(
                    onClick = { textArea = textField },
                    modifier = Modifier.fillMaxWidth()
                ) { Text("Click!") }
            }
        }
    }
}
