package am.victor.catworld.ui.main

import am.victor.catworld.R
import am.victor.catworld.ui.cats.view.CatsFragment
import am.victor.catworld.ui.favorites.view.FavoriteCatsFragment
import am.victor.catworld.ui.moxy.BaseMvpFragment
import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CatsPagerAdapter(fragmentManager: FragmentManager, context: Context) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var tabs = listOf(
        context.getString(R.string.cats) to CatsFragment.newInstance(),
        context.getString(R.string.favorites) to FavoriteCatsFragment.newInstance()
    )

    override fun getItem(position: Int) = tabs[position].second as BaseMvpFragment

    override fun getCount() = tabs.size

    override fun getPageTitle(position: Int) = tabs[position].first

}