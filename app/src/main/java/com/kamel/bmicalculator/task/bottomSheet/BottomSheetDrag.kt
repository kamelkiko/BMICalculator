package com.kamel.bmicalculator.task.bottomSheet

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomSheetDrag(modifier: Modifier = Modifier) {
    Divider(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp)),
        thickness = 6.dp,
        color = Color.LightGray.copy(0.5f)
    )
}