package com.kamel.bmicalculator.ui.composable

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.ui.theme.Headline
import com.kamel.bmicalculator.ui.theme.Surface

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BMITopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    titleColor: Color = Color.White,
    backgroundColor: Color = Surface,
    shadowColor: Color = Color.Black,
    hasShadow: Boolean = true,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                color = titleColor,
                style = Headline,
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = backgroundColor
        ),
        modifier = if (hasShadow) modifier
            .shadow(
                16.dp,
                ambientColor = shadowColor,
                spotColor = shadowColor,
            ) else modifier
    )
}
