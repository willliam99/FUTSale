package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_settings.domain.use_case

import dagger.Lazy
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
data class SettingsUseCases @Inject constructor(
    val getCurrentAppLocaleUseCase: Lazy<GetCurrentAppLocaleUseCase>,
    val getCurrentAppThemeUseCase: Lazy<GetCurrentAppThemeUseCase>,
    val getIsNotificationSoundEnabledUseCase: Lazy<GetIsNotificationSoundEnabledUseCase>,
    val getIsNotificationVibrateEnabledUseCase: Lazy<GetIsNotificationVibrateEnabledUseCase>,
    val storeCurrentAppLocaleUseCase: Lazy<StoreCurrentAppLocaleUseCase>,
    val storeCurrentAppThemeUseCase: Lazy<StoreCurrentAppThemeUseCase>,
    val storeIsNotificationSoundEnabledUseCase: Lazy<StoreIsNotificationSoundEnabledUseCase>,
    val storeIsNotificationVibrateEnabledUseCase: Lazy<StoreIsNotificationVibrateEnabledUseCase>
)