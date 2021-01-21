package com.yaya.framework.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * @author qiuyawei
 * @createTime 2021/1/21 9:27 AM
 * @describe
 */
class MusicService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}