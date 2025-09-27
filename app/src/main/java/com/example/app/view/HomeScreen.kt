package com.example.app.view
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.app.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun homeScreen(navController : NavController) {

    Scaffold( //Esto es la estructura base
        topBar = {
            TopAppBar(title = { Text("Mi Aplicación en Kotlin FBLink") })
        }
    ) { innerPadding -> //Esto es para hacer separaciones
        Column( //Se puede estructurar en columna
            modifier = Modifier //Modificador de aspecto
                .padding(innerPadding) //espaciado
                .fillMaxSize() //ocupar linea compleata
                .padding(16.dp), //Espaciado específico
            verticalArrangement = Arrangement.Center //Alineacion centrada
        ) {
            Text(text = "Bienvenid@!",
                fontWeight = FontWeight.Bold //texto en negrita
            )
            /*onClick es para llamar una accion --> navigate es quien hace la navegación
            por medio de la ruta en String*/
            Button(onClick = {navController.navigate("SecondScreen")},
                colors = ButtonDefaults.buttonColors(
                    Color.Black,
                    Color.White
                )
            ) {
                Text("Presióname")


            }
            //Para subir imagenes
            //Painter es quien obtiene y muestra
            Image(
                painter = painterResource(id = R.drawable.escudo),
                "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp), //altura de la imagen
                contentScale = ContentScale.Fit //escalado (fit, crop, etc)

            )
        }

    }
}

