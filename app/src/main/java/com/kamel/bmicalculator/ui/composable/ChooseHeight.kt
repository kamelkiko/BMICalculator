package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.theme.ContentTertiary
import com.kamel.bmicalculator.ui.theme.Primary
import com.kamel.bmicalculator.ui.theme.TitleLarge

@Composable
fun ChooseHeight(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(172.dp)
            .background(color = Primary, shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(R.string.height),
            color = ContentTertiary,
            style = TitleLarge,
            textAlign = TextAlign.Center,
        )
        BMIProgressIndicator(modifier = Modifier.fillMaxWidth())
    }
}