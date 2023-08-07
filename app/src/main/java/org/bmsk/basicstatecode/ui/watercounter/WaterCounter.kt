package org.bmsk.basicstatecode.ui.watercounter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Text(text = "${count}잔의 물을 마셨습니다.", modifier = modifier.padding(16.dp))
}