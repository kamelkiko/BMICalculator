package com.kamel.bmicalculator.task.bottomSheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.task.composables.HorizontalDivider
import com.kamel.bmicalculator.ui.theme.TaskRed

@Composable
fun BottomSheetHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row {
            Image(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.mac),
                contentDescription = stringResource(R.string.profile),
                contentScale = ContentScale.FillBounds,
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    text = "Palestine",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black.copy(alpha = 0.87f),
                        fontFamily = FontFamily.SansSerif,
                    )
                )
                Text(
                    text = "#01234567",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black.copy(alpha = 0.37f),
                        fontFamily = FontFamily.SansSerif,
                    )
                )
            }
        }
        Column {
            Text(
                text = "52",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TaskRed,
                    fontFamily = FontFamily.SansSerif,
                )
            )
            Row {
                Text(
                    text = stringResource(R.string.delivery_code),
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
        }
    }
    HorizontalDivider()
}