package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DiceRoller()
                }
            }
        }
    }
}
//R.drawable.dice_1
@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)) {

    var result by remember { mutableStateOf(1)}

    val imageResource = when (result) {
        1 -> R.drawable.__1
        2 -> R.drawable.d1_2
        3 -> R.drawable.d3_1
        4 -> R.drawable.d4_1
        5 -> R.drawable.d5_1
        6 -> R.drawable.d6_1
        7 -> R.drawable.d2_2
        8 -> R.drawable.d2_3
        9 -> R.drawable.d4_2
        10 -> R.drawable.__2
        11 -> R.drawable.d2_6
        12 -> R.drawable.__3
        13 -> R.drawable.d3_4
        14 -> R.drawable.d5_3
        15 -> R.drawable.d3_6
        16 -> R.drawable.__4
        17 -> R.drawable.d4_5
        18 -> R.drawable.d4_6
        19 -> R.drawable.__5
        20 -> R.drawable.d5_6
        else -> R.drawable.__6
    }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {

        Image(
            painter = painterResource(id = imageResource),
           contentDescription = result.toString(),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            result = (1 .. 21).random()
        }) {
            Text(text = stringResource(R.string.roll))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DiceRoller() {
    DiceWithButtonAndImage()
}
