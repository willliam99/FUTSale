package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Result
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.errors.GetLatestAppVersionError
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.models.LatestAppUpdateInfo
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.repositories.AppUpdateRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class GetLatestAppVersionUseCase @Inject constructor(
    private val appUpdateRepository: AppUpdateRepository
) {
    operator fun invoke(): Flow<Result<LatestAppUpdateInfo?, GetLatestAppVersionError>> = flow {
        return@flow emit(appUpdateRepository.getLatestAppVersion())
    }
}