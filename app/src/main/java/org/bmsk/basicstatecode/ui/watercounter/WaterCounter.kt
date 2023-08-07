package org.bmsk.basicstatecode.ui.watercounter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            Text(text = "${count}잔의 물을 마셨습니다.")
        }

        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text(text = "한 잔 추가")
        }
    }
}