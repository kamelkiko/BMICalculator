package com.kamel.bmicalculator.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.composable.BMITopAppBar
import com.kamel.bmicalculator.ui.composable.ChooseGender
import com.kamel.bmicalculator.ui.composable.ChooseHeight
import com.kamel.bmicalculator.ui.composable.ChooseWeightAndAge
import com.kamel.bmicalculator.ui.theme.Background
import com.kamel.bmicalculator.ui.theme.ContentSecondary
import com.kamel.bmicalculator.ui.theme.HeadlineLarge
import com.kamel.bmicalculator.ui.theme.Tertiary

@Composable
fun HomeScreen() {
    HomeContent()
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
private fun HomeContent() {
    Scaffold(
        topBar = {
            BMITopAppBar(
                title = stringResource(R.string.bmi_calculator),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
        },
        containerColor = Background
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            ChooseGender()
            ChooseHeight()
            ChooseWeightAndAge()
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(0.dp)),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Tertiary,
                    contentColor = ContentSecondary,
                )
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    color = ContentSecondary,
                    style = HeadlineLarge,
                    textAlign = TextAlign.Center,
                    text = stringResource(R.string.calculate_your_bmi)
                )
            }
        }
    }
}