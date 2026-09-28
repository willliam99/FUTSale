package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.presentation.states

import android.os.Parcelable
import com.google.android.play.core.review.ReviewInfo
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.PreviousRateAppRequestDateTime
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.RateAppOption
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.models.LatestAppUpdateInfo
import kotlinx.parcelize.Parcelize

@Parcelize
data class HomeState(
    val isAppReviewDialogVisible: Boolean = false,
    val selectedRateAppOption: RateAppOption? = null,
    val previousRateAppRequestDateTime: PreviousRateAppRequestDateTime? = null,
    val inAppReviewInfo: ReviewInfo? = null,
    val latestAppUpdateInfo: LatestAppUpdateInfo? = null,
    val postNotificationPermissionState: PostNotificationPermissionState = PostNotificationPermissionState()
) : Parcelable