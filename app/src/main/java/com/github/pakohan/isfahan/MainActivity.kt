package com.github.pakohan.isfahan.app

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import com.github.pakohan.isfahan.R
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf

class MainActivity : AppCompatActivity() {
    val text = mutableStateOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var myText by text
        myText = getString(R.string.hello)
        setContent {
            Column {
                Text(text = myText)
                Button(onClick = { myText = "clicked" }) { Text("Click!") }
            }
        }
    }
}
