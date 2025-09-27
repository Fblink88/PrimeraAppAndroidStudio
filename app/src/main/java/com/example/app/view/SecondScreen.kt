package com.example.app.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.app.R

@Composable
fun secondScreen(navController : NavController) {

    Button(
        onClick = {navController.popBackStack()},
    ) {
        Text("Devuélveme")
    }
    //Se crea una columna para darle caracteristicas y configuracion
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(

            painter = painterResource(id = R.drawable.logo1),
            "Logo App",
            modifier = Modifier

                .fillMaxWidth()
                .height(300.dp), //altura de la imagen
            contentScale = ContentScale.Fit //escalado (fit, crop, etc)


        )
    }
}