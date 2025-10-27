package io.github.joelkanyi.threadly

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "threadly",
    ) {
        App()
    }
}