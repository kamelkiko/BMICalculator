package com.kamel.bmicalculator.task.bottomSheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamel.bmicalculator.R

@Composable
fun BottomSheetFooter(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row {
            Text(
                text = "2 x items",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(alpha = 0.37f),
                    fontFamily = FontFamily.SansSerif,
                )
            )
            Icon(
                modifier = Modifier.padding(start = 4.dp),
                painter = painterResource(id = R.drawable.info),
                contentDescription = stringResource(R.string.info),
                tint = Color(0xFF3867D6),
            )
        }
        Row {
            Icon(
                painter = painterResource(id = R.drawable.baseline_attach_money_24),
                contentDescription = stringResource(R.string.cash),
            )
            Text(
                text = "20.00",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black.copy(alpha = 0.87f),
                    fontFamily = FontFamily.SansSerif,
                )
            )
        }
    }
}