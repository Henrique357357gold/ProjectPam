package com.example.projectpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectpam.ui.theme.ProjectPamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectPamTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MainAppScreen() {
    ProjectPamTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ){
            SaudarUsuarioLogado("App")
        }

    }
}

@Composable
fun SaudarUsuarioLogado(nomeDoUsuarioLogado: String){
    Column {
        Text(text = "Oii, $nomeDoUsuarioLogado!")
        Text("Como você está?")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPrev() {
    MainAppScreen()
}