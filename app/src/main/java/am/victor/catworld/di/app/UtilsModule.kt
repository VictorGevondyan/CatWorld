package am.victor.catworld.di.app

import am.victor.catworld.rx.AppRxSchedulers
import am.victor.catworld.rx.RxSchedulers
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {

    @Provides
    internal fun provideRxSchedulers(): RxSchedulers = AppRxSchedulers()
}
