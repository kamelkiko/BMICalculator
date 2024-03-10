package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R

@Composable
fun ChooseWeightAndAge(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(128.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        BMICounter(
            title = stringResource(id = R.string.weight),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
        )
        BMICounter(
            title = stringResource(R.string.age),
            modifier = Modifier.fillMaxSize()
        )
    }
}