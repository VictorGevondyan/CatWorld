package am.victor.catworld.ui.main

import am.victor.catworld.CatWorldApplication
import am.victor.catworld.R
import am.victor.catworld.di.activity.ActivityComponent
import am.victor.catworld.di.activity.ActivityModule
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var activityComponent: ActivityComponent? = null

    fun getActivityComponent(): ActivityComponent {
        return activityComponent ?: createComponent()
            .also { activityComponent = it }
    }

    private fun createComponent() =
        (application as CatWorldApplication).appComponent.plus(ActivityModule(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getActivityComponent().inject(this)

        setContentView(R.layout.activity_main)

        val catsPagerAdapter = CatsPagerAdapter(supportFragmentManager, this)
        cats_view_pager.adapter = catsPagerAdapter
        cats_tab_layout.setupWithViewPager(cats_view_pager)

    }

}