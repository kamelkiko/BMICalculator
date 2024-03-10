package com.kamel.bmicalculator.task.bottomSheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.task.composables.DeliveryProcess

@Composable
fun TaskBottomSheet(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                Color.White,
                RoundedCornerShape(topEndPercent = 8, topStartPercent = 8)
            ),
    ) {
        BottomSheetDrag(
            Modifier
                .fillMaxWidth(0.2f)
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally)
        )
        BottomSheetHeader()
        DeliveryProcess(Modifier.padding(top = 8.dp))
        BottomSheetTimer(Modifier.padding(top = 8.dp))
        BottomSheetFooter(Modifier.padding(top = 8.dp))
    }
}