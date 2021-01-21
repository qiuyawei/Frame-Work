package com.yaya.framework

import android.app.Activity
import android.app.Application
import android.media.MediaPlayer
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author qiuyawei
 * @createTime 2021/1/18 1:42 PM
 * @describe
 */
class MyApplication : Application() {
    private val isDebug = true

    //是否有播放背景音乐
    private lateinit var mediaPlayer: MediaPlayer
    private var bgMusicHadStart = false
    override fun onCreate() {
        super.onCreate()
        initAliRouter()
        initBgMusic()
        initLifecycle()
    }


    private fun initAliRouter() {
        if (isDebug) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

    private fun initBgMusic() {
        if (!bgMusicHadStart) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bg_music)
            mediaPlayer.isLooping = true
            mediaPlayer?.start()
            bgMusicHadStart = true
        }
    }

    private fun initLifecycle() {
        registerActivityLifecycleCallbacks(
            object : ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                }

                override fun onActivityStarted(activity: Activity) {
                }

                override fun onActivityResumed(activity: Activity) {
                    if (bgMusicHadStart) {
                        mediaPlayer?.start()
                    }
                }

                override fun onActivityPaused(activity: Activity) {
                    if (bgMusicHadStart) {
                        mediaPlayer?.pause()
                    }
                }

                override fun onActivityStopped(activity: Activity) {
                }

                override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                }

                override fun onActivityDestroyed(activity: Activity) {
                }
            })
    }

}