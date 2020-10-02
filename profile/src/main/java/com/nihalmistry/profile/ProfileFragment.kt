package com.nihalmistry.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*

private const val TEST_DATA = "testData"

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var testData: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            testData = it.getInt(TEST_DATA)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_test_data.text = "Test Data: $testData"
    }

}