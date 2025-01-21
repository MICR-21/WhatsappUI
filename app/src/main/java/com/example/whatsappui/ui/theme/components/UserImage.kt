package com.example.whatsappui.ui.theme.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.R

@Composable
fun UserImage(userImage: Int) {
    Icon(
        modifier = Modifier.size(60.dp),
        painter= painterResource(id = userImage),contentDescription = "",)

}

@Preview(showBackground = true)
@Composable
fun UserImagePreview(){
    UserImage(userImage = R.drawable.ic_user)
}