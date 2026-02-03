package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.repositories.AppUpdateRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.repositories.IsUpdateDownloaded
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class CheckIsFlexibleUpdateStalledUseCase @Inject constructor(
    private val appUpdateRepository: AppUpdateRepository
) {
    operator fun invoke(): Flow<IsUpdateDownloaded> =
        appUpdateRepository.checkIsFlexibleUpdateStalled()
}