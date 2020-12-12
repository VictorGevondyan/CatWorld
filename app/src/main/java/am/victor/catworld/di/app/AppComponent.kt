package am.victor.catworld.di.app

import am.victor.catworld.api.CatsApi
import am.victor.catworld.rx.RxSchedulers
import am.victor.catworld.di.activity.ActivityComponent
import am.victor.catworld.di.activity.ActivityModule

import dagger.Component

@AppScope
@Component(modules = [NetworkModule::class, AppContextModule::class, UtilsModule::class])
interface AppComponent {

    operator fun plus(activityModule: ActivityModule): ActivityComponent

    fun rxSchedulers(): RxSchedulers

    fun apiService(): CatsApi

}
