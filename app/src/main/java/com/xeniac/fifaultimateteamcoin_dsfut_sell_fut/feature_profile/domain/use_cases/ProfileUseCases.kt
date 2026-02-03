package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_profile.domain.use_cases

import dagger.Lazy
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
data class ProfileUseCases @Inject constructor(
    val getPartnerIdUseCase: Lazy<GetPartnerIdUseCase>,
    val getSecretKeyUseCase: Lazy<GetSecretKeyUseCase>,
    val updatePartnerIdUseCase: Lazy<UpdatePartnerIdUseCase>,
    val updateSecretKeyUseCase: Lazy<UpdateSecretKeyUseCase>
)