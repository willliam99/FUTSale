package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.presentation.common.ui.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

fun Modifier.dashedBorderBehind(
    strokeWidth: Dp,
    color: Color,
    cornerRadius: Dp,
    dash: Dp,
    gap: Dp,
    strokeCap: StrokeCap = StrokeCap.Round
) = composed {
    val density = LocalDensity.current
    val strokeWidthPx = with(density) { strokeWidth.toPx() }
    val cornerRadiusPx = with(density) { cornerRadius.toPx() }

    then(
        Modifier.drawWithCache {
            onDrawBehind {
                val stroke = Stroke(
                    width = strokeWidthPx,
                    cap = strokeCap,
                    pathEffect = PathEffect.dashPathEffect(
                        intervals = floatArrayOf(dash.toPx(), gap.toPx()),
                        phase = 0f
                    )
                )

                drawRoundRect(
                    color = color,
                    style = stroke,
                    cornerRadius = CornerRadius(cornerRadiusPx)
                )
            }
        }
    )
}

fun Modifier.dashedBorder(
    strokeWidth: Dp,
    color: Color,
    cornerRadius: Dp,
    dash: Dp,
    gap: Dp,
    strokeCap: StrokeCap = StrokeCap.Round
) = composed {
    val density = LocalDensity.current
    val strokeWidthPx = with(density) { strokeWidth.toPx() }
    val cornerRadiusPx = with(density) { cornerRadius.toPx() }

    then(
        Modifier.drawWithContent {
            drawContent()
            val stroke = Stroke(
                width = strokeWidthPx,
                cap = strokeCap,
                pathEffect = PathEffect.dashPathEffect(
                    intervals = floatArrayOf(dash.toPx(), gap.toPx()),
                    phase = 0f
                )
            )

            drawRoundRect(
                color = color,
                style = stroke,
                cornerRadius = CornerRadius(cornerRadiusPx)
            )
        }
    )
}