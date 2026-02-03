package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.PermissionsDataStoreRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class StoreNotificationPermissionCountUseCase @Inject constructor(
    private val permissionsDataStoreRepository: PermissionsDataStoreRepository
) {
    operator fun invoke(
        count: Int
    ): Flow<Unit> = flow {
        return@flow emit(permissionsDataStoreRepository.storeNotificationPermissionCount(count))
    }
}