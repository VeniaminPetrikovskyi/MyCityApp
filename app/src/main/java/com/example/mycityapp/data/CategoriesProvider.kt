package com.example.mycityapp.data

import com.example.mycityapp.R


object CategoriesProvider {
    val categories = listOf(
        Item(
            image = R.drawable.parks,
            contentDescription = R.string.park_content_desc,
            text = R.string.park_text
        ),
        Item(
            image = R.drawable.beaches,
            contentDescription = R.string.beach_content_desc,
            text = R.string.beach_text
        ),
        Item(
            image = R.drawable.malls,
            contentDescription = R.string.mall_content_desc,
            text = R.string.mall_text
        ),
        Item(
            image = R.drawable.cafes,
            contentDescription = R.string.cafe_content_desc,
            text = R.string.cafe_text
        ),
        Item(
            image = R.drawable.museums,
            contentDescription = R.string.museum_content_desc,
            text = R.string.museum_text
        ),
    )
}

object RecommendationsProvider {
    val parksRecommendations = listOf(
        Item(
            image = R.drawable.park_gorky,
            contentDescription = R.string.park_gorky,
            text = R.string.park_gorky
        ),
        Item(
            image = R.drawable.park_greek,
            contentDescription = R.string.park_greek,
            text = R.string.park_greek
        ),
        Item(
            image = R.drawable.park_pobedy,
            contentDescription = R.string.park_pobedy,
            text = R.string.park_pobedy
        ),
        Item(
            image = R.drawable.park_istanbul,
            contentDescription = R.string.park_istanbul,
            text = R.string.park_istanbul
        ),
        Item(
            image = R.drawable.park_shevchenko,
            contentDescription = R.string.park_shevchenko,
            text = R.string.park_shevchenko
        ),
    )
    val beachesRecommendations = listOf(
        Item(
            image = R.drawable.beach,
            contentDescription = R.string.beach_ibiza,
            text = R.string.beach_ibiza
        ),
        Item(
            image = R.drawable.beach,
            contentDescription = R.string.beach_itaka,
            text = R.string.beach_itaka
        ),
        Item(
            image = R.drawable.beach,
            contentDescription = R.string.beach_otrada,
            text = R.string.beach_otrada
        ),
        Item(
            image = R.drawable.beach,
            contentDescription = R.string.beach_caleton,
            text = R.string.beach_caleton
        ),
        Item(
            image = R.drawable.beach,
            contentDescription = R.string.beach_dolphin,
            text = R.string.beach_dolphin
        ),
    )
    val mallsRecommendations = listOf(
        Item(
            image = R.drawable.gagarin_plaza,
            contentDescription = R.string.mall_gagarin_plaza,
            text = R.string.mall_gagarin_plaza
        ),
        Item(
            image = R.drawable.city_center,
            contentDescription = R.string.mall_city_center,
            text = R.string.mall_city_center
        ),
        Item(
            image = R.drawable.riviera,
            contentDescription = R.string.mall_riviera,
            text = R.string.mall_riviera
        ),
        Item(
            image = R.drawable.sady_pobedy,
            contentDescription = R.string.mall_victory_gardens,
            text = R.string.mall_victory_gardens
        ),
        Item(
            image = R.drawable.fontan_sky,
            contentDescription = R.string.mall_fontan_sky,
            text = R.string.mall_fontan_sky
        ),
    )
    val cafesRecommendations = listOf(
        Item(
            image = R.drawable.restaurant,
            contentDescription = R.string.cafe_yug,
            text = R.string.cafe_yug
        ),
        Item(
            image = R.drawable.restaurant,
            contentDescription = R.string.cafe_lou_lou,
            text = R.string.cafe_lou_lou
        ),
        Item(
            image = R.drawable.restaurant,
            contentDescription = R.string.cafe_central,
            text = R.string.cafe_central
        ),
        Item(
            image = R.drawable.restaurant,
            contentDescription = R.string.cafe_beerteka,
            text = R.string.cafe_beerteka
        ),
        Item(
            image = R.drawable.restaurant,
            contentDescription = R.string.cafe_compote,
            text = R.string.cafe_compote
        ),
    )
    val museumsRecommendations = listOf(
        Item(
            image = R.drawable.museum,
            contentDescription = R.string.museum_chocolate,
            text = R.string.museum_chocolate
        ),
        Item(
            image = R.drawable.museum,
            contentDescription = R.string.museum_modern_art,
            text = R.string.museum_modern_art
        ),
        Item(
            image = R.drawable.museum,
            contentDescription = R.string.museum_east_west_art,
            text = R.string.museum_east_west_art
        ),
        Item(
            image = R.drawable.museum,
            contentDescription = R.string.museum_archeology,
            text = R.string.museum_archeology
        ),
        Item(
            image = R.drawable.museum,
            contentDescription = R.string.museum_interesting_science,
            text = R.string.museum_interesting_science
        ),
    )
}