package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.presentation.util

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.R
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.presentation.common.utils.UiText
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.errors.StoreRequestNotificationPermissionDateError

fun StoreRequestNotificationPermissionDateError.asUiText(): UiText = when (this) {
    StoreRequestNotificationPermissionDateError.SomethingWentWrong -> UiText.StringResource(R.string.error_something_went_wrong)
}