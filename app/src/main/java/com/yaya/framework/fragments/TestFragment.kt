package com.yaya.framework.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.blankj.utilcode.util.LogUtils
import com.yaya.framework.R

/**
 * @author qiuyawei
 * @createTime 2021/1/19 5:26 PM
 * @describe
 */
class TestFragment : Fragment() {
    val mTag = "TestFragment"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(mTag, "onCreateView")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(mTag, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(mTag, "onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(mTag, "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(mTag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(mTag, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(mTag, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(mTag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(mTag, "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.i(mTag, "onDetach")
    }
}