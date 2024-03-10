package com.kamel.bmicalculator.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.composable.BMISelectionCard

@Composable
fun ChooseGender(
    modifier: Modifier = Modifier,
) {
    var isMaleSelected by remember { mutableStateOf(false) }
    var isFeMaleSelected by remember { mutableStateOf(false) }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(136.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        BMISelectionCard(
            title = stringResource(R.string.male),
            icon = painterResource(id = R.drawable.ic_male),
            contentDescription = stringResource(R.string.male_desc),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            isSelected = isMaleSelected
        ) {
            isMaleSelected = !isMaleSelected
            isFeMaleSelected = false
        }
        BMISelectionCard(
            title = stringResource(R.string.female),
            icon = painterResource(id = R.drawable.ic_female),
            contentDescription = stringResource(R.string.female_desc),
            modifier = Modifier.fillMaxSize(),
            isSelected = isFeMaleSelected
        ) {
            isFeMaleSelected = !isFeMaleSelected
            isMaleSelected = false
        }
    }
}