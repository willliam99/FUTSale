package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.models.Result
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.DsfutDataStoreRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.domain.errors.CompleteOnboardingError
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class CompleteOnboardingUseCase @Inject constructor(
    private val dsfutDataStoreRepository: DsfutDataStoreRepository
) {
    operator fun invoke(
        partnerId: String?,
        secretKey: String?
    ): Flow<Result<Unit, CompleteOnboardingError>> = flow {
        return@flow try {
            with(dsfutDataStoreRepository) {
                storePartnerId(partnerId = partnerId)
                storeSecretKey(secretKey = secretKey)
                isOnboardingCompleted(isCompleted = true)
            }
            emit(Result.Success(Unit))
        } catch (e: Exception) {
            emit(Result.Error(CompleteOnboardingError.SomethingWentWrong))
        }
    }
}