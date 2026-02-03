package com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.presentation.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.presentation.common.states.CustomTextFieldState
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.core.presentation.common.ui.components.BouncingDotIndicator
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.presentation.OnboardingAction
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.presentation.states.OnboardingPageItem
import com.xeniac.fifaultimateteamcoin_dsfut_sell_fut.feature_onboarding.presentation.utils.TestTags
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun OnboardingPager(
    partnerIdState: CustomTextFieldState,
    secretKeyState: CustomTextFieldState,
    modifier: Modifier = Modifier,
    onAction: (action: OnboardingAction) -> Unit
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(
        pageCount = { OnboardingPageItem.entries.size },
        initialPage = OnboardingPageItem.PAGE_ONE.index
    )

    BackHandler(
        enabled = pagerState.settledPage != OnboardingPageItem.PAGE_ONE.index,
        onBack = {
            scope.launch {
                pagerState.animateScrollToPage(page = pagerState.settledPage - 1)
            }
        }
    )

    Column(modifier = modifier.fillMaxSize()) {
        BouncingDotIndicator(
            count = pagerState.pageCount,
            pagerState = pagerState,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        HorizontalPager(
            state = pagerState,
            beyondViewportPageCount = 1,
            userScrollEnabled = true,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .testTag(TestTags.HORIZONTAL_PAGER)
                .semantics {
                    testTagsAsResourceId = true
                }
        ) { scrollPosition ->
            when (scrollPosition) {
                OnboardingPageItem.PAGE_ONE.index -> {
                    OnboardingPageOne(
                        onSkipBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_FOUR.index
                                )
                            }
                        },
                        onNextBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_TWO.index
                                )
                            }
                        }
                    )
                }
                OnboardingPageItem.PAGE_TWO.index -> {
                    OnboardingPageTwo(
                        onBackBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_ONE.index
                                )
                            }
                        },
                        onNextBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_THREE.index
                                )
                            }
                        }
                    )
                }
                OnboardingPageItem.PAGE_THREE.index -> {
                    OnboardingPageThree(
                        onBackBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_TWO.index
                                )
                            }
                        },
                        onNextBtnClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(
                                    page = OnboardingPageItem.PAGE_FOUR.index
                                )
                            }
                        }
                    )
                }
                OnboardingPageItem.PAGE_FOUR.index -> {
                    OnboardingPageFour(
                        partnerIdState = partnerIdState,
                        secretKeyState = secretKeyState,
                        onAction = onAction
                    )
                }
            }
        }
    }
}