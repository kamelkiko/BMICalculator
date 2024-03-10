package com.kamel.bmicalculator.task.composables

import android.graphics.Color
import android.os.Build.VERSION_CODES.R
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.ui.theme.TaskRed

@Composable
fun DeliveryProcess(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DeliveryState(
            hasFinished = true,
            statusIcon = painterResource(id = R.drawable.prepare),
            contentDescription = stringResource(R.string.prepare),
        )
        DashedDivider(
            thickness = 2.dp,
            modifier = Modifier
                .weight(0.25f),
            color = TaskRed,
        )
        DeliveryState(
            hasFinished = true,
            statusIcon = painterResource(id = R.drawable.cooking),
            contentDescription = stringResource(R.string.cooking),
        )
        DashedDivider(
            thickness = 2.dp,
            modifier = Modifier
                .weight(0.25f),
            color = TaskRed,
        )
        DeliveryState(
            hasFinished = false,
            statusIcon = painterResource(id = R.drawable.ride),
            contentDescription = stringResource(R.string.coming),
        )
        DashedDivider(
            thickness = 2.dp,
            modifier = Modifier
                .weight(0.25f),
            color = Color.LightGray.copy(0.20f),
        )
        DeliveryState(
            hasFinished = false,
            statusIcon = painterResource(id = R.drawable.baseline_check_24),
            contentDescription = stringResource(R.string.coming),
        )
    }
    HorizontalDivider()
}

@Composable
private fun DeliveryState(
    hasFinished: Boolean,
    statusIcon: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
) {
    val backgroundColor by animateColorAsState(
        if (hasFinished) TaskRed
        else Color.White, label = ""
    )

    val iconColor by animateColorAsState(
        if (hasFinished) Color.White
        else Color(0xFFD91643), label = ""
    )

    val borderColor by animateColorAsState(
        if (hasFinished) backgroundColor
        else Color(0xFFD91643), label = ""
    )

    IconWithBackground(
        modifier = modifier.size(32.dp),
        icon = statusIcon,
        contentDescription = contentDescription,
        iconSize = 16.dp,
        shape = CircleShape,
        backgroundColor = backgroundColor,
        iconColor = iconColor,
        borderColor = borderColor
    )
}