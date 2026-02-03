package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_profile.domain.validation

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_profile.domain.errors.UpdateSecretKeyError
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ValidateSecretKey @Inject constructor() {
    operator fun invoke(
        secretKey: String
    ): UpdateSecretKeyError? {
        return null
    }
}