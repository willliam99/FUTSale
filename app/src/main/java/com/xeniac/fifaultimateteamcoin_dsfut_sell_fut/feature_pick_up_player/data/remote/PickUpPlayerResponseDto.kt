package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PickUpPlayerResponseDto(
    @SerialName("player")
    val playerDto: PlayerDto? = null,
    @SerialName("message")
    val message: String? = null,
    @SerialName("error")
    val error: String? = null
)