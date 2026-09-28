package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.PermissionsDataStoreRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class GetIsRequestNotificationPermissionShownTodayUseCase @Inject constructor(
    private val repository: PermissionsDataStoreRepository
) {
    operator fun invoke(): Flow<Boolean> = flow {
        return@flow emit(repository.isRequestNotificationPermissionShownToday())
    }
}