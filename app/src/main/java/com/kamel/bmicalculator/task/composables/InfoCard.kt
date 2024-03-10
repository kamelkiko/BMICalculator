package com.kamel.bmicalculator.task.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.kamel.bmicalculator.ui.theme.TaskGrey

@Composable
fun InfoCard(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(horizontal = 24.dp)
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Row {
                IconWithBackground(
                    modifier = Modifier.size(48.dp),
                    icon = painterResource(id = R.drawable.profile),
                    contentDescription = stringResource(R.string.profile),
                    shape = CircleShape,
                    backgroundColor = Color.LightGray.copy(alpha = 0.20f),
                    iconSize = 32.dp,
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        modifier = Modifier.padding(bottom = 4.dp),
                        text = "Jackson S.",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black.copy(alpha = 0.87f),
                            fontFamily = FontFamily.SansSerif,
                        )
                    )
                    Row {
                        Icon(
                            modifier = Modifier.padding(end = 4.dp),
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = stringResource(R.string.rate),
                            tint = Color(0xFFFFA801),
                        )
                        Text(
                            text = "4.5",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.Black.copy(alpha = 0.80f),
                                fontFamily = FontFamily.SansSerif,
                            )
                        )
                    }
                }
            }
            IconWithBackground(
                modifier = Modifier.size(52.dp),
                icon = painterResource(id = R.drawable.call),
                contentDescription = stringResource(R.string.call),
                shape = CircleShape,
                iconColor = Color(0xFF3867D6),
                borderColor = TaskGrey,
            )
        }
    }
}