package am.victor.catworld.ui.favorites.view

import am.victor.catworld.db.FavoriteCat
import am.victor.catworld.ui.moxy.BaseMvpView
import am.victor.catworld.ui.moxy.MvpProgressView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface FavoriteCatsView : BaseMvpView, MvpProgressView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun addFavoriteCats(favoriteCatsList: List<FavoriteCat>)

}