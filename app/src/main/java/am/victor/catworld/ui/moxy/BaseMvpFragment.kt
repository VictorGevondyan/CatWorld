package am.victor.catworld.ui.moxy

import am.victor.catworld.di.activity.ActivityComponent
import am.victor.catworld.ui.main.MainActivity

open class BaseMvpFragment : MvpAppCompatFragment(), BaseMvpView {

    protected val activityComponent: ActivityComponent
        get() = mainActivity.getActivityComponent()

    protected val mainActivity: MainActivity
        get() = requireActivity() as MainActivity

    /**
     * @return true if handled in this method
     */
    fun onBackPressed(): Boolean {
        return false
    }

}
