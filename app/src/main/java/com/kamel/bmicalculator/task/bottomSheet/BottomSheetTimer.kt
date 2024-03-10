package com.kamel.bmicalculator.task.bottomSheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamel.bmicalculator.task.composables.AnimatedCircularProgressIndicator
import com.kamel.bmicalculator.task.composables.HorizontalDivider
import com.kamel.bmicalculator.ui.theme.TaskGreen
import com.kamel.bmicalculator.ui.theme.TaskGrey

@Composable
fun BottomSheetTimer(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val annotatedString = remember {
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black.copy(alpha = 0.37f),
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                    )
                ) {
                    append("Jackson S. is on the way to deliver\n your order. Eta ")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black.copy(0.87f),
                        fontFamily = FontFamily.SansSerif,
                    )
                ) {
                    append("09:41 PM")
                }
            }
        }
        Text(
            text = annotatedString,
        )
        AnimatedCircularProgressIndicator(
            modifier=Modifier.padding(start = 48.dp),
            currentValue = 45,
            maxValue = 100,
            progressBackgroundColor = TaskGrey,
            progressIndicatorColor = TaskGreen,
        )
    }
    HorizontalDivider()
}