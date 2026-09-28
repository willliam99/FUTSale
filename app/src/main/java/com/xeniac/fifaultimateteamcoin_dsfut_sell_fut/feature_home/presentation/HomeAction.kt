package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.presentation

sealed interface HomeAction {
    data object CheckIsAppUpdateStalled : HomeAction
    data object CheckFlexibleUpdateDownloadState : HomeAction
    data object CheckForAppUpdates : HomeAction
    data object GetLatestAppVersion : HomeAction
    data object DismissAppUpdateSheet : HomeAction

    data object RequestInAppReviews : HomeAction
    data object LaunchInAppReview : HomeAction
    data object SetSelectedRateAppOptionToNever : HomeAction
    data object SetSelectedRateAppOptionToRemindLater : HomeAction
    data object DismissAppReviewDialog : HomeAction

    data class OnNotificationPermissionResult(
        val isGranted: Boolean,
        val isPermanentlyDeclined: Boolean
    ) : HomeAction

    data object DismissNotificationPermissionDialog : HomeAction
}