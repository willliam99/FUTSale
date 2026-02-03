package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.use_case

import com.google.android.play.core.review.ReviewInfo
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_home.domain.repositories.AppReviewRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class RequestInAppReviewsUseCase @Inject constructor(
    private val appReviewRepository: AppReviewRepository
) {
    operator fun invoke(): Flow<ReviewInfo?> = appReviewRepository.requestInAppReviews()
}