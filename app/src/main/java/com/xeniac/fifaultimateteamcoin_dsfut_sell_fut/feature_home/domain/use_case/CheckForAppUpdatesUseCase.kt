package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.google.android.play.core.appupdate.AppUpdateInfo
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.repositories.AppUpdateRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class CheckForAppUpdatesUseCase @Inject constructor(
    private val appUpdateRepository: AppUpdateRepository
) {
    operator fun invoke(): Flow<AppUpdateInfo?> = appUpdateRepository.checkForAppUpdates()
}