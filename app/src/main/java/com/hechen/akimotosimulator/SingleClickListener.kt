package com.hechen.akimotosimulator

import android.view.View

/**
 * @university King's College London
 * @author He Chen
 * @ID 21044375
 *
 * If the interval between two clicks is longer than the delay,
 * the click is considered as a single click
 */
class SingleClickListener(private val delay: Long, private val action:() -> Unit): View.OnClickListener {

    private var lastClickTime: Long = 0L
    override fun onClick(v: View?) {
        val currentClickTime = System.currentTimeMillis()
        if (currentClickTime - lastClickTime >= delay) {
            lastClickTime = currentClickTime
            action()
        }
    }
}