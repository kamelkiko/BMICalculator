package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.theme.Caption
import com.kamel.bmicalculator.ui.theme.ContentSecondary
import com.kamel.bmicalculator.ui.theme.ContentTertiary
import com.kamel.bmicalculator.ui.theme.HeadlineLarge
import com.kamel.bmicalculator.ui.theme.Tertiary

private val heightRange = 70f..250f
private const val START_HEIGHT = 70f

@Composable
fun BMIProgressIndicator(
    modifier: Modifier = Modifier,
) {
    var progress by remember { mutableFloatStateOf(START_HEIGHT) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(
                text = "${progress.toInt()} ",
                style = HeadlineLarge,
                color = ContentSecondary
            )
            Text(
                text = stringResource(R.string.cm),
                style = Caption,
                color = ContentTertiary
            )
        }
        Slider(
            value = progress,
            onValueChange = { newValue ->
                progress = newValue
            },
            modifier = Modifier.fillMaxWidth(),
            colors = SliderDefaults.colors(
                thumbColor = Tertiary,
                activeTrackColor = Color.White,
            ),
            valueRange = heightRange,
        )
    }
}