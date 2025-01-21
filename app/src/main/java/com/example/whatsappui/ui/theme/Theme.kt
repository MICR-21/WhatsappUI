package com.example.whatsappui.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Gray,
    secondary = LightGray,
    background = LightGray,
    tertiary = Gray
)

private val LightColorScheme = lightColorScheme(
    primary = Green,
    secondary = LightGreen,
    background = White,
    tertiary = White

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun WhatsappUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),

    content: @Composable () -> Unit
) {
   val colorSchema = if(darkTheme){
        DarkColorScheme
    }else{
            LightColorScheme
    }
    val view= LocalView.current
    if(!view.isInEditMode){
        val systemUiController = rememberSystemUiController()
        val statusBarColor= if(isSystemInDarkTheme()){
            Gray
        }else{
            Green
        }

        val navigationBarColor = if(isSystemInDarkTheme()){
            LightGray
        }else{
            White
        }

        SideEffect {
            systemUiController.setStatusBarColor(
                statusBarColor
            )
            systemUiController.setNavigationBarColor(
                navigationBarColor
            )
        }
    }

    MaterialTheme(
        colorScheme = colorSchema,
        typography = Typography,
        content = content
    )
}