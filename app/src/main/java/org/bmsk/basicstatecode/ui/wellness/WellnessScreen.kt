package org.bmsk.basicstatecode.ui.wellness

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.bmsk.basicstatecode.ui.watercounter.WaterCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier)
}