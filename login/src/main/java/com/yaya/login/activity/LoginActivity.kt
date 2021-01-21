package com.yaya.login.activity

import com.alibaba.android.arouter.facade.annotation.Route
import com.yaya.base.base.BaseActivity
import com.yaya.base.const.RouterPath
import com.yaya.login.R

/**
 * @author qiuyawei
 * @createTime 2021/1/20 1:36 PM
 * @describe
 */
@Route(path = RouterPath.LOGIN)
class LoginActivity : BaseActivity() {
    override fun initLayout(): Int {
        return R.layout.activity_login
    }
}