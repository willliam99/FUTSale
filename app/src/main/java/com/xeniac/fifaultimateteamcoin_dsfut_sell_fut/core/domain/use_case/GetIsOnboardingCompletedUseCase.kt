package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.use_case

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.DsfutDataStoreRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class GetIsOnboardingCompletedUseCase @Inject constructor(
    private val dsfutDataStoreRepository: DsfutDataStoreRepository
) {
    operator fun invoke(): Flow<Boolean> = flow {
        return@flow emit(dsfutDataStoreRepository.isOnboardingCompleted())
    }
}