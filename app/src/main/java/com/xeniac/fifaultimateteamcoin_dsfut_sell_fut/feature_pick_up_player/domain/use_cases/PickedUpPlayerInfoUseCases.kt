package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.di.PickedUpPlayerInfoQualifier
import dagger.Lazy
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
data class PickedUpPlayerInfoUseCases @Inject constructor(
    val observePickedUpPlayerUseCase: Lazy<ObservePickedUpPlayerUseCase>,
    @param:PickedUpPlayerInfoQualifier val startCountDownTimerUseCase: Lazy<StartCountDownTimerUseCase>
)