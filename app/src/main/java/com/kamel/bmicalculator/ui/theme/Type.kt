package com.kamel.bmicalculator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kamel.bmicalculator.R

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val HeadlineLarge = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_bold, FontWeight.Bold, FontStyle.Normal)),
    fontSize = 24.sp,
    fontWeight = FontWeight.W600,
)

val Headline = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_semi_bold, FontWeight.SemiBold, FontStyle.Normal)),
    fontSize = 20.sp,
    fontWeight = FontWeight.W600,
)

val TitleLarge = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_semi_bold, FontWeight.SemiBold, FontStyle.Normal)),
    fontSize = 16.sp,
    fontWeight = FontWeight.W600,
)

val Title = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_regular, FontWeight.Normal, FontStyle.Normal)),
    fontSize = 14.sp,
    fontWeight = FontWeight.W600,
)

val TitleMedium = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_medium, FontWeight.Medium, FontStyle.Normal)),
    fontSize = 16.sp,
    fontWeight = FontWeight.W400,
)

val Caption = TextStyle(
    fontFamily = FontFamily(Font(R.font.poppins_regular, FontWeight.Normal, FontStyle.Normal)),
    fontSize = 12.sp,
    fontWeight = FontWeight.W300,
)