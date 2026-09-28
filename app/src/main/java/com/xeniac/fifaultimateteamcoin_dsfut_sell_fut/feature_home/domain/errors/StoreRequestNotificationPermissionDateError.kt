package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.errors

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.errors.Error

sealed class StoreRequestNotificationPermissionDateError : Error() {
    data object SomethingWentWrong : StoreRequestNotificationPermissionDateError()
}