package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_profile.domain.use_cases

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.repositories.DsfutDataStoreRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class GetSecretKeyUseCase @Inject constructor(
    private val dsfutDataStoreRepository: DsfutDataStoreRepository
) {
    operator fun invoke(): Flow<String?> = flow {
        return@flow emit(dsfutDataStoreRepository.getSecretKey())
    }
}