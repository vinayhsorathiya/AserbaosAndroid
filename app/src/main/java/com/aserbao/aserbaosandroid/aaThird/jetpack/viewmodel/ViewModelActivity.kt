package com.aserbao.aserbaosandroid.aaThird.jetpack.viewmodel

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aserbao.aserbaosandroid.R
import com.aserbao.aserbaosandroid.comon.base.BaseRecyclerViewActivity

/*
 * 作用：
 * @author aserbao
 * @date: on 2020/3/18
 * @project: AserbaosAndroid
 * @package: com.aserbao.aserbaosandroid.aaThird.jetpack.viewmodel
 */
class ViewModelActivity : BaseRecyclerViewActivity() {
    override fun initGetData() {
        addLayoutToFrameLayout(R.layout.fragment_left_and_right,true)
    }
    override fun itemClickBack(view: View, position: Int, isLongClick: Boolean, comeFrom: Int) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}