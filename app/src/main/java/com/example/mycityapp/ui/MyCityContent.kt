package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycityapp.R
import com.example.mycityapp.data.CategoriesProvider
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import com.example.mycityapp.data.Item
import com.example.mycityapp.data.RecommendationsProvider

@Composable
fun ListItem(
    text: String,
    description: String,
    imageRes: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    selected: Boolean = false
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = if (selected) {
                MaterialTheme.colorScheme.inversePrimary
            } else {
                MaterialTheme.colorScheme.secondaryContainer
            }
        ),
        onClick = onClick
    ) {
        Row {
            Image(
                painter = imageRes,
                contentDescription = description,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .size(100.dp)
                    .wrapContentSize(Alignment.CenterStart)
                    .aspectRatio(1f)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun CategoriesList(
    myCityUiState: MyCityUiState,
    onClick: (Item) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(CategoriesProvider.categories) { category ->
            ListItem(
                text = stringResource(id = category.text),
                description = stringResource(id = category.contentDescription),
                imageRes = painterResource(id = category.image),
                onClick = {onClick(category)},
                selected = myCityUiState.currentSelectedCategory == category,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun ParksList(
    onClick: (Item) -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(RecommendationsProvider.parksRecommendations) { park ->
            ListItem(
                text = stringResource(id = park.text),
                description = stringResource(id = park.contentDescription),
                imageRes = painterResource(id = park.image),
                onClick = {onClick(park)},
                selected = myCityUiState.currentSelectedRecommendation == park,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun BeachesList(
    onClick: (Item) -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(RecommendationsProvider.beachesRecommendations) { beach ->
            ListItem(
                text = stringResource(id = beach.text),
                description = stringResource(id = beach.contentDescription),
                imageRes = painterResource(id = beach.image),
                onClick = {onClick(beach)},
                selected = myCityUiState.currentSelectedRecommendation == beach,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun MallsList(
    onClick: (Item) -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(RecommendationsProvider.mallsRecommendations) { mall ->
            ListItem(
                text = stringResource(id = mall.text),
                description = stringResource(id = mall.contentDescription),
                imageRes = painterResource(id = mall.image),
                onClick = {onClick(mall)},
                selected = myCityUiState.currentSelectedRecommendation == mall,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun CafesList(
    onClick: (Item) -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(RecommendationsProvider.cafesRecommendations) { cafe ->
            ListItem(
                text = stringResource(id = cafe.text),
                description = stringResource(id = cafe.contentDescription),
                imageRes = painterResource(id = cafe.image),
                onClick = {onClick(cafe)},
                selected = myCityUiState.currentSelectedRecommendation == cafe,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun MuseumsList(
    onClick: (Item) -> Unit,
    myCityUiState: MyCityUiState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(RecommendationsProvider.museumsRecommendations) { museum ->
            ListItem(
                text = stringResource(id = museum.text),
                description = stringResource(id = museum.contentDescription),
                imageRes = painterResource(id = museum.image),
                onClick = {onClick(museum)},
                selected = myCityUiState.currentSelectedRecommendation == museum,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.secondaryContainer)
    ) {
        Image(
            painter = painterResource(id = R.drawable.park_greek),
            contentDescription = "",
            alignment = Alignment.TopCenter,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = stringResource(id = R.string.example_text),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview
@Composable
fun ListItemPreview() {
    ListItem(
        text = stringResource(id = R.string.museum_text),
        description = "",
        imageRes = painterResource(id = R.drawable.museums),
        onClick = {  },
        selected = false
    )
}

@Preview
@Composable
fun CategoriesPreview() {
    CategoriesList(MyCityUiState(), {})
}

@Preview
@Composable
fun ParksPreview() {
    ParksList({}, MyCityUiState())
}

@Preview
@Composable
fun BeachesPreview() {
    BeachesList({}, MyCityUiState())
}

@Preview
@Composable
fun MallsPreview() {
    MallsList({}, MyCityUiState())
}

@Preview
@Composable
fun CafesPreview() {
    CafesList({}, MyCityUiState())
}

@Preview
@Composable
fun MuseumsPreview() {
    MuseumsList({}, MyCityUiState())
}

@Preview
@Composable
fun DetailsPreview() {
    DetailsScreen()
}