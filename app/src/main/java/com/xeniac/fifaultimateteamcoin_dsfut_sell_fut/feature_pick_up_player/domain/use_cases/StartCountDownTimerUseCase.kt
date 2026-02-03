package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.repositories.CountDownTimerRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.repositories.TimerValueInSeconds
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class StartCountDownTimerUseCase @Inject constructor(
    private val countDownTimerRepository: CountDownTimerRepository
) {
    operator fun invoke(
        expiryTimeInMs: Long
    ): Flow<TimerValueInSeconds> = countDownTimerRepository.observeCountDownTimer(expiryTimeInMs)
}