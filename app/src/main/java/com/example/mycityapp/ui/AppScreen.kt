package com.example.mycityapp.ui

import androidx.activity.compose.BackHandler
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mycityapp.R
import com.example.mycityapp.data.Item
import com.example.mycityapp.ui.utils.ContentType

@Composable
fun AppScreen(
    contentType: ContentType,
    myCityUiState: MyCityUiState,
    onCategoryClick: (Item) -> Unit,
    onRecommendationClick: (Item) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBackClick()
    }
    Column {
        if (contentType == ContentType.LIST_ONLY) {
            if (myCityUiState.currentSelectedCategory == null) {
                Header(onclick = { }, text = R.string.app_name)
                CategoriesList(myCityUiState, onCategoryClick)
            } else {
                Header(onclick = onBackClick, text = myCityUiState.currentSelectedCategory.text)
                if (myCityUiState.currentSelectedRecommendation == null) {
                    when (myCityUiState.currentSelectedCategory.text) {
                        R.string.cafe_text -> CafesList(
                            onRecommendationClick,
                            myCityUiState,
                        )

                        R.string.park_text -> ParksList(
                            onRecommendationClick,
                            myCityUiState,
                        )

                        R.string.mall_text -> MallsList(
                            onRecommendationClick,
                            myCityUiState,
                        )

                        R.string.beach_text -> BeachesList(
                            onRecommendationClick,
                            myCityUiState,
                        )

                        R.string.museum_text -> MuseumsList(
                            onRecommendationClick,
                            myCityUiState,
                        )
                    }
                } else {
                    DetailsScreen()
                }
            }
        } else {
            Header(onclick = { }, text = R.string.app_name)
            Row(
                modifier = modifier,
            ) {
                CategoriesList(
                    myCityUiState,
                    onClick = onCategoryClick,
                    modifier = Modifier.weight(1f)
                )
                if (myCityUiState.currentSelectedCategory != null) {
                    Spacer(modifier = Modifier.padding(12.dp))
                    when (myCityUiState.currentSelectedCategory.text) {
                        R.string.cafe_text -> CafesList(
                            onRecommendationClick,
                            myCityUiState,
                            modifier = Modifier.weight(1f)
                        )

                        R.string.park_text -> ParksList(
                            onRecommendationClick,
                            myCityUiState,
                            modifier = Modifier.weight(1f)
                        )

                        R.string.mall_text -> MallsList(
                            onRecommendationClick,
                            myCityUiState,
                            modifier = Modifier.weight(1f)
                        )

                        R.string.beach_text -> BeachesList(
                            onRecommendationClick,
                            myCityUiState,
                            modifier = Modifier.weight(1f)
                        )

                        R.string.museum_text -> MuseumsList(
                            onRecommendationClick,
                            myCityUiState,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                if (myCityUiState.currentSelectedRecommendation != null) {
                    Spacer(modifier = Modifier.padding(12.dp))
                    DetailsScreen(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun Header(
    onclick: () -> Unit,
    @StringRes text: Int,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        if (text != R.string.app_name) {
            IconButton(
                onClick = onclick,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .background(MaterialTheme.colorScheme.surface, shape = CircleShape),
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(id = R.string.back_button)
                )
            }
        }
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        )
    }
}
