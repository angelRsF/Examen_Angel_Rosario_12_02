package com.example.examen_angel_rosario_12_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ejercicio()
        }
    }

    @Composable
    fun ejercicio() {
        var contador by rememberSaveable { mutableStateOf(0) }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 45.dp)
                .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(
                    text = "Ángel",
                    fontSize = 28.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Rosario",
                    fontSize = 28.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painterResource(
                            id = R.drawable.taberna
                        ), contentDescription = "Taberna",
                        modifier = Modifier
                            .clickable { contador++ }
                            .height(80.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Contador = $contador",
                        fontSize = 28.sp,
                        color = Color.Black,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            }
            item {
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painterResource(
                        id = R.drawable.empecinado
                    ), contentDescription = "Empecinado",
                    modifier = Modifier
                        .height(100.dp)
                )
                Text(
                    text = "Imagen Referente al Empecinado",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painterResource(
                        id = R.drawable.empecinado
                    ), contentDescription = "Empecinado",
                    modifier = Modifier
                        .height(100.dp)
                )
                Text(
                    text = "Segunda Imagen Referente al Empecinado",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painterResource(
                        id = R.drawable.empecinado
                    ), contentDescription = "Empecinado",
                    modifier = Modifier
                        .height(100.dp)
                )
                Text(
                    text = "Tercera Imagen Referente al Empecinado",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 30.dp)
                )
                {
                    item {
                        Image(
                            painterResource(
                                id = R.drawable.cid
                            ), contentDescription = "ImagenEjemplo",
                            modifier = Modifier
                                .height(80.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painterResource(
                                id = R.drawable.cid
                            ), contentDescription = "ImagenEjemplo",
                            modifier = Modifier
                                .height(80.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painterResource(
                                id = R.drawable.cid
                            ), contentDescription = "ImagenEjemplo",
                            modifier = Modifier
                                .height(80.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painterResource(
                                id = R.drawable.cid
                            ), contentDescription = "ImagenEjemplo",
                            modifier = Modifier
                                .height(80.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Image(
                            painterResource(
                                id = R.drawable.cid
                            ), contentDescription = "ImagenEjemplo",
                            modifier = Modifier
                                .height(80.dp)
                        )
                    }
                }
            }
        }
    }
}



