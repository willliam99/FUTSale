package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_history.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Player
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_history.domain.repositories.HistoryRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ObserverPickedUpPlayerUseCase @Inject constructor(
    private val historyRepository: HistoryRepository
) {
    operator fun invoke(
        playerId: Long
    ): Flow<Player> = historyRepository.observerPickedUpPlayer(playerId)
}