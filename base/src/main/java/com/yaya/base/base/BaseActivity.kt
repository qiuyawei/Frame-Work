package com.yaya.base.base

import android.R
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.blankj.utilcode.util.BarUtils


/**
 * @author qiuyawei
 * @createTime 2021/1/14 3:30 PM
 * @describe 整个项目的基类 activity，所有新建的Activity 必须继承该类
 */
open abstract class BaseActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //设置状态栏透明
        BarUtils.setStatusBarColor(this, Color.TRANSPARENT)
        setContentView(initLayout())
        //预留出状态栏的高度
        val mRootView = (findViewById<ViewGroup>(R.id.content)).getChildAt(0)
        mRootView?.setPadding(
            0,
            BarUtils.getStatusBarHeight(),
            0,
            0
        )
    }


    /**
     * 设置布局文件
     */
    abstract fun initLayout(): Int
}