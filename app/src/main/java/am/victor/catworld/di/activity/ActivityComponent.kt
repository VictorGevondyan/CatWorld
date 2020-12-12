package am.victor.catworld.di.activity

import am.victor.catworld.di.fragment.FragmentComponent
import am.victor.catworld.di.fragment.FragmentModule
import am.victor.catworld.ui.main.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    operator fun plus(module: FragmentModule): FragmentComponent

    fun inject(mainActivity: MainActivity)

}
