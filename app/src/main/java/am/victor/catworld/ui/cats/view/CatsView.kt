package am.victor.catworld.ui.cats.view

import am.victor.catworld.api.models.Cat
import am.victor.catworld.ui.moxy.BaseMvpView
import am.victor.catworld.ui.moxy.MvpProgressView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface CatsView : BaseMvpView, MvpProgressView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun addCats(catsList: List<Cat>)

    fun setPagination()

}