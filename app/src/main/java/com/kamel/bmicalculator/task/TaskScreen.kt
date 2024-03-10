package com.kamel.bmicalculator.task

import android.content.Context
import android.graphics.Bitmap
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.kamel.bmicalculator.R
import com.kamel.bmicalculator.task.bottomSheet.TaskBottomSheet
import com.kamel.bmicalculator.task.composables.IconWithBackground
import com.kamel.bmicalculator.task.composables.InfoCard

@Composable
fun TaskScreen() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        val egypt = LatLng(30.044420, 31.235712)
        val cameraPositionState = rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(egypt, 15f)
        }
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            Marker(
                state = MarkerState(position = egypt),
                title = "Cairo",
                snippet = "Marker in Cairo",
                icon = bitmapDescriptor(context, R.drawable.marker)
            )
        }
        IconWithBackground(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
                .size(48.dp),
            icon = painterResource(id = R.drawable.back),
            contentDescription = stringResource(R.string.back),
            iconSize = 22.dp
        )
        TaskContent(
            modifier = Modifier
                .fillMaxHeight(0.51f)
                .align(Alignment.BottomStart)
        )
        InfoCard(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.11f)
                .align(Alignment.BottomStart)
        )
    }
}

@Composable
private fun TaskContent(
    modifier: Modifier = Modifier,
) {
    TaskBottomSheet(modifier = modifier)
}


private fun bitmapDescriptor(
    context: Context,
    vectorResId: Int,
): BitmapDescriptor? {
    val drawable = ContextCompat.getDrawable(context, vectorResId) ?: return null
    drawable.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
    val bm = Bitmap.createBitmap(
        drawable.intrinsicWidth,
        drawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
    )
    val canvas = android.graphics.Canvas(bm)
    drawable.draw(canvas)
    return BitmapDescriptorFactory.fromBitmap(bm)
}

@Composable
@Preview
fun c(){
    TaskScreen()
}