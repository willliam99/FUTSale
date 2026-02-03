package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.di

import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.repositories.CountDownTimerRepository
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_pick_up_player.domain.use_cases.StartCountDownTimerUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Qualifier

@Module
@InstallIn(ViewModelComponent::class)
object PickedUpPlayerInfoModule {

    @Provides
    @ViewModelScoped
    @PickedUpPlayerInfoQualifier
    fun provideStartCountDownTimerUseCase(
        countDownTimerRepository: CountDownTimerRepository
    ): StartCountDownTimerUseCase = StartCountDownTimerUseCase(countDownTimerRepository)
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PickedUpPlayerInfoQualifier