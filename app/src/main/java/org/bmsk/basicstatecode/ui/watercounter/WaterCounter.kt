package org.bmsk.basicstatecode.ui.watercounter

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count = 0
    Text(text = "${count}잔의 물을 마셨습니다.", modifier = modifier.padding(16.dp))
    Button(onClick = { count++ }, modifier = Modifier.padding(top = 8.dp)) {
        Text(text = "한 잔 추가")
    }
}