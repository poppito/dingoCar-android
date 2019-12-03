package com.dingocar.common

import com.dingocar.ui.DrivingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author Fabio de Matos
 * @since 03/12/2019.
 */
class KoinModules {

    companion object {
        fun getInstance(): KoinModules {
            return KoinModules()
        }
    }

    fun getAllModules() = listOf(uiModule, domainModule)

    private val uiModule = module {
        viewModel { DrivingViewModel() }
    }


    private val domainModule = module {

    }

}