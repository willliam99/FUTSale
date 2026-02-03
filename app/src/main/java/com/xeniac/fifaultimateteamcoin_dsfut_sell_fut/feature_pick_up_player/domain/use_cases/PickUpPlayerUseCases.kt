package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.di.PickUpPlayerQualifier
import dagger.Lazy
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
data class PickUpPlayerUseCases @Inject constructor(
    val observeLatestPickedUpPlayersUseCase: Lazy<ObserveLatestPickedUpPlayersUseCase>,
    val getIsNotificationSoundEnabledUseCase: Lazy<GetIsNotificationSoundEnabledUseCase>,
    val getIsNotificationVibrateEnabledUseCase: Lazy<GetIsNotificationVibrateEnabledUseCase>,
    val getSelectedPlatformUseCase: Lazy<GetSelectedPlatformUseCase>,
    val storeSelectedPlatformUseCase: Lazy<StoreSelectedPlatformUseCase>,
    val pickUpPlayerUseCase: Lazy<PickUpPlayerUseCase>,
    @param:PickUpPlayerQualifier val startCountDownTimerUseCase: Lazy<StartCountDownTimerUseCase>
)