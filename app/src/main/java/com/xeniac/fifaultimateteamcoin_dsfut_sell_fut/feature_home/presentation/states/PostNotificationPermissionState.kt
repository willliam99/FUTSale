package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.presentation.states

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostNotificationPermissionState(
    val isRequestNotificationPermissionShownToday: Boolean = false,
    val isNotificationPermissionPermanentlyDeclined: Boolean = false,
    val isNotificationPermissionDialogVisible: Boolean = false
) : Parcelable