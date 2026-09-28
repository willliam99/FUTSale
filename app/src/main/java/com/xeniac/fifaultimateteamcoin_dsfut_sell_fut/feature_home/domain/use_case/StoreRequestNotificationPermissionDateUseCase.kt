package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Result
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.PermissionsDataStoreRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.errors.StoreRequestNotificationPermissionDateError
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import timber.log.Timber
import javax.inject.Inject

@ViewModelScoped
class StoreRequestNotificationPermissionDateUseCase @Inject constructor(
    private val repository: PermissionsDataStoreRepository
) {
    operator fun invoke(): Flow<Result<Unit, StoreRequestNotificationPermissionDateError>> = flow {
        return@flow try {
            repository.storeRequestNotificationPermissionDate()
            emit(Result.Success(Unit))
        } catch (e: Exception) {
            currentCoroutineContext().ensureActive()
            Timber.e("Store request notification permission date Exception:")
            e.printStackTrace()
            emit(Result.Error(StoreRequestNotificationPermissionDateError.SomethingWentWrong))
        }
    }
}