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

    var result by remember { mutableStateOf(1) }

    val imageResource = when (result) {
        1 -> R.drawable.mona_lisa__by_leonardo_da_vinci__from_c2rmf_retouched
        2 -> R.drawable.the_persistence_of_memory_1931_salvador_dali
        3 -> R.drawable.__michelangelo___creation_of_adam__cropped
        4 -> R.drawable.van_gogh___starry_night___google_art_project
        else -> R.drawable.___640px_ultima_cena___da_vinci_5_compressor
    }

    val textResource = when (result) {
        1 -> "Mona Lisa by Leonardo Da Vinci"
        2 -> "The Persistence of Memory by Salvador Dali"
        3 -> "The Creation of Adam by Michelangelo Buonarroti"
        4 -> "The Starry Night by Vincent Van Gogh"
        else -> "The Last Supper by Leonardo Da Vinci"
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString(),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = textResource
        )
        Row(
            modifier = modifier) {
            Button(onClick = {
                if (result >= 2) {
                    result -= 1
                }
            }) {
                Text(text = stringResource(R.string.previous))
            }
            Button(onClick = {
                if (result <= 4) {
                    result += 1
                }
            }) {
                Text(text = stringResource(R.string.next))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DiceRoller() {
    DiceWithButtonAndImage()
}
