package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_settings.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.AppTheme
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Result
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.SettingsDataStoreRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_settings.domain.errors.StoreAppThemeError
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class StoreCurrentAppThemeUseCase @Inject constructor(
    private val settingsDataStoreRepository: SettingsDataStoreRepository
) {
    operator fun invoke(
        newAppTheme: AppTheme
    ): Flow<Result<Unit, StoreAppThemeError>> = flow {
        return@flow try {
            settingsDataStoreRepository.storeCurrentAppTheme(newAppTheme)
            emit(Result.Success(Unit))
        } catch (e: Exception) {
            emit(Result.Error(StoreAppThemeError.SomethingWentWrong))
        }
    }
}