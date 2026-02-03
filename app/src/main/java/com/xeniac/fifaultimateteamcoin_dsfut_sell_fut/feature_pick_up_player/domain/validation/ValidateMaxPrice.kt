package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.validation

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.errors.PickUpPlayerError
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ValidateMaxPrice @Inject constructor() {
    operator fun invoke(
        maxPrice: String?
    ): PickUpPlayerError? {
        val isMaxPriceBlank = maxPrice.isNullOrBlank()
        val doesMaxPriceContainNonDigits = !isMaxPriceBlank && maxPrice.any { !it.isDigit() }
        if (doesMaxPriceContainNonDigits) {
            return PickUpPlayerError.InvalidMaxPrice
        }

        return null
    }
}