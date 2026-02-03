package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.domain.use_case

import dagger.Lazy
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
data class MainUseCases @Inject constructor(
    val getCurrentAppLocaleUseCase: Lazy<GetCurrentAppLocaleUseCase>,
    val getIsOnboardingCompletedUseCase: Lazy<GetIsOnboardingCompletedUseCase>
)