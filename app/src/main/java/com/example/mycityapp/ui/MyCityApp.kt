package com.example.mycityapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.mycityapp.ui.utils.ContentType
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycityapp.data.Item


@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
) {
    val viewModel: MyCityViewModel = viewModel()
    val myCityUiState = viewModel.uiState.collectAsState().value

    val contentType: ContentType = when (windowSize) {
        WindowWidthSizeClass.Compact -> {
            ContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Medium -> {
            ContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Expanded -> {
            ContentType.SCROLLING
        }
        else -> {
            ContentType.LIST_ONLY
        }
    }
    AppScreen(
        contentType = contentType,
        myCityUiState = myCityUiState,
        onCategoryClick = { item: Item -> viewModel.selectCategory(item) },
        onRecommendationClick = { item: Item -> viewModel.selectRecommendation(item) },
        onBackClick = { viewModel.backHome() },
        modifier = modifier
    )
}

