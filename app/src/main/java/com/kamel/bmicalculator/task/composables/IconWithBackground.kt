package com.kamel.bmicalculator.task.composables

import android.graphics.Color
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IconWithBackground(
    icon: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    iconSize: Dp = 26.dp,
    iconColor: Color = Color.Black,
    backgroundColor: Color = Color.White,
    borderColor: Color = backgroundColor,
    radiusSize: Dp = 12.dp,
    shape: Shape = RoundedCornerShape(radiusSize),
) {
    Column(
        modifier = modifier
            .background(backgroundColor, shape)
            .border(width = 1.dp, color = borderColor, shape = CircleShape),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            painter = icon,
            contentDescription = contentDescription,
            tint = iconColor,
        )
    }
}