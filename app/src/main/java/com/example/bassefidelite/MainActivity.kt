package com.example.bassefidelite

import android.location.Address
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bassefidelite.ui.theme.BasseFideliteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasseFideliteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){
                    BasseFideliteTheme {
                        GestionLogo(
                            stringResource(R.string.Nom),
                            stringResource(R.string.fonction),
                            stringResource(R.string.numero),
                            stringResource(R.string.addMail),
                            stringResource(R.string.localization)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Gestiontext(nomComp: String, fonction: String, modifier: Modifier = Modifier) {
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxSize()
        ){

        } }

@Composable
fun GestionCoordon(num: String, mail: String, address: String, modifier: Modifier = Modifier) {
    Column (
//        modifier = modifier
//            .padding(top = 100.dp, start = 35.dp)
//        modifier=modifier
//        .fillMaxSize()
    ){
        val logoTel = painterResource(R.drawable.baseline_phone_24)
        Row(
            modifier = Modifier
                .padding(

                    bottom = 2.dp)
        ) {
            Icon(
                painter = logoTel,
                contentDescription = "Telephone",
                modifier = modifier
                    .padding(
                        top = 100.dp,
                        start = 3.dp
                    )
                    .size(25.dp)
            )
            Text(
                text = num,
                fontSize = 20.sp,
                modifier = modifier.padding(
                    top = 100.dp,
                    start = 20.dp
                )
            )
        }
            Row {
                val emai = painterResource(R.drawable.baseline_email_24)
                Icon(
                    painter = emai,
                    contentDescription = "Email",
                    modifier = modifier.padding(
                        top = 35.dp,
                        start = 3.dp
                    )

                    )
            Text(
                text = mail,
                fontSize = 20.sp,
                modifier = modifier.padding(
                    top = 35.dp,
                    start = 20.dp
                )
            )
        }
        Row {
            val addr = painterResource(R.drawable.baseline_location_on_24)
            Icon(
                painter = addr,
                contentDescription = "Notre adresse",
                modifier= modifier.padding(
                    top = 35.dp,
                    start = 3.dp
                )

            )
            Text(
                text = address,
                fontSize = 20.sp,
                modifier = modifier.padding(
                    top = 35.dp,
                    start = 20.dp
                )
            )
        }

    }
}

@Composable
fun GestionLogo(nomComp: String, fonction: String, num: String, mail: String, address: String, modifier: Modifier = Modifier) {
val android = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = android,
            contentDescription = null,
            modifier= Modifier
        )
        Text(
            text = nomComp,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = modifier.padding(
//                top = 24.dp,
                bottom = 3.dp
            )
        )
        Text(
            text = fonction,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier= Modifier
        )
        GestionCoordon(
            num = num,
            mail = mail,
            address = address,
            modifier = modifier
        )

    }
}

@Preview(showBackground = false)
@Composable
fun FidelitePreview() {
    BasseFideliteTheme {
        GestionLogo(
            stringResource(R.string.Nom),
            stringResource(R.string.fonction),
            stringResource(R.string.numero),
            stringResource(R.string.addMail),
            stringResource(R.string.localization)
        )
    }
}