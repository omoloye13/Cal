package com.folashade.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class CalculatorViewModel: viewModel() {
    var state by mutableStateOf(CalculatorState())
        private  set
}