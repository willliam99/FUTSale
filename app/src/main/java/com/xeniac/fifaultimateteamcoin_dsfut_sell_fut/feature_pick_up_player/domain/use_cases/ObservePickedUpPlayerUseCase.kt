package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Player
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.repositories.PickedUpPlayersRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ObservePickedUpPlayerUseCase @Inject constructor(
    private val pickedUpPlayersRepository: PickedUpPlayersRepository
) {
    operator fun invoke(
        playerId: Long
    ): Flow<Player> = pickedUpPlayersRepository.observePickedUpPlayer(playerId)
}