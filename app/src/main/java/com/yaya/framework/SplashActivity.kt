package com.yaya.framework

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.yaya.base.base.BaseActivity
import com.yaya.base.const.RouterPath
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.delay

/**
 * @author qiuyawei
 * @createTime 2021/1/18 10:16 AM
 * @describe
 */
@Route(path = RouterPath.SPLASH_PATH)
class SplashActivity : BaseActivity() {
    private val delayTime = 3000L
    override fun initLayout(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}