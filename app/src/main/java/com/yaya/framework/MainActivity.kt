package com.yaya.framework

import com.alibaba.android.arouter.facade.annotation.Route
import com.yaya.base.base.BaseActivity
import com.yaya.base.const.RouterPath

/**
 * @author qiuyawei
 * @createTime 2021/1/14 5:14 PM
 * @describe
 */
@Route(path = RouterPath.MAIN_PATH)
class MainActivity : BaseActivity() {
    override fun initLayout(): Int {
        return R.layout.activity_main
    }
}