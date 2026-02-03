package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.validation

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.errors.PickUpPlayerError
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ValidateTakeAfter @Inject constructor() {
    operator fun invoke(
        takeAfter: Int?
    ): PickUpPlayerError? {
        if (takeAfter == null) {
            return PickUpPlayerError.InvalidTakeAfter
        }

        return null
    }
}