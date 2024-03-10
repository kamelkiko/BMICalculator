package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.theme.ContentPrimary
import com.kamel.bmicalculator.ui.theme.ContentSecondary
import com.kamel.bmicalculator.ui.theme.ContentTertiary
import com.kamel.bmicalculator.ui.theme.HeadlineLarge
import com.kamel.bmicalculator.ui.theme.Primary
import com.kamel.bmicalculator.ui.theme.Secondary
import com.kamel.bmicalculator.ui.theme.TitleLarge

@Composable
fun BMICounter(
    title: String,
    modifier: Modifier = Modifier,
) {
    var counter by remember { mutableStateOf(0) }
    Column(
        modifier = modifier
            .background(color = Primary, shape = RoundedCornerShape(8.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            text = title,
            color = ContentTertiary,
            style = TitleLarge,
            textAlign = TextAlign.Center,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            text = counter.toString(),
            color = ContentSecondary,
            style = HeadlineLarge,
            textAlign = TextAlign.Center,
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            IconButton(
                modifier = Modifier.background(Secondary, CircleShape),
                onClick = { --counter }
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = stringResource(R.string.minus),
                    tint = ContentPrimary
                )
            }
            IconButton(
                modifier = Modifier.background(Secondary, CircleShape),
                onClick = { ++counter },
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(R.string.plus),
                    tint = ContentPrimary
                )
            }
        }
    }
}