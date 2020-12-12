package am.victor.catworld.di.fragment


import am.victor.catworld.ui.cats.view.CatsFragment
import am.victor.catworld.ui.favorites.view.FavoriteCatsFragment
import dagger.Subcomponent

@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: CatsFragment)
    fun inject(fragment: FavoriteCatsFragment)

}
