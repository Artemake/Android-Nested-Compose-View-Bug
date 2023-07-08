package com.learninglakner.android_nested_compose_view_bug.ui.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ComposeScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(scrollState)
    ) {
        Item("Item 1")
        Item("Item 2")
        Item("Item 3")
        Item("Item 4")
        Item("Item 5")
        Item("Item 6")
        Item("Item 7")
        Item("Item 8")
        Item("Item 9")
        Item("Item 10")
    }
}

@Composable
fun Item(text: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp)
            .padding(all = 4.dp)
            .border(width = 4.dp, color = Color.Green, shape = RoundedCornerShape(7.dp))
            .clip(shape = RoundedCornerShape(7.dp))
            .background(color = Color.White)
    ) {
        Text(modifier = Modifier.align(Alignment.Center), text = text)
    }
}