package am.victor.catworld.ui.favorites.presenter

import am.victor.catworld.CatWorldApplication
import am.victor.catworld.rx.RxSchedulers
import am.victor.catworld.ui.favorites.view.FavoriteCatsView
import am.victor.catworld.ui.moxy.BaseMvpPresenter
import com.arellomobile.mvp.InjectViewState
import io.reactivex.rxjava3.core.Observable
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class FavoriteCatsPresenter @Inject internal constructor(
    private val rxSchedulers: RxSchedulers,
) : BaseMvpPresenter<FavoriteCatsView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        loadFavoriteCats()
    }

    fun loadFavoriteCats() {

        Observable.fromCallable { CatWorldApplication.catWorldDb.favoriteCatDao().getAll() }
            .compose(rxSchedulers.ioToMain())
            .progress()
            .subscribe(
                { result ->
                    viewState.addFavoriteCats(result)
                },
                { throwable ->
                    Timber.e(throwable as Throwable, "Error loading cats list!")
                }
            ).unsubscribeOnDestroy()

    }

}
