package com.manish.samplejetpacknavigation

import androidx.fragment.app.Fragment
import androidx.navigation.NavController


val Fragment.navController: NavController
    get() = (activity as MainActivity).navController