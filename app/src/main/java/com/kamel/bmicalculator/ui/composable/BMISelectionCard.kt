package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.ui.theme.ContentPrimary
import com.kamel.bmicalculator.ui.theme.ContentTertiary
import com.kamel.bmicalculator.ui.theme.Primary
import com.kamel.bmicalculator.ui.theme.Tertiary
import com.kamel.bmicalculator.ui.theme.TitleLarge

@Composable
fun BMISelectionCard(
    title: String,
    icon: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    contentColor: Color = Primary,
    isSelected: Boolean = false,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .background(
                if (isSelected)
                    Tertiary
                else contentColor,
                shape = RoundedCornerShape(8.dp)
            )
            .clickable(onClick = onClick),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = icon,
            contentDescription = contentDescription,
            tint = if (isSelected) Color.White
            else ContentTertiary,
            modifier = Modifier.size(80.dp)
        )
        Text(
            text = title,
            color = if (isSelected) ContentPrimary
            else ContentTertiary,
            style = TitleLarge
        )
    }
}