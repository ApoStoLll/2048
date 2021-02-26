package com.miss.a2048.game

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.miss.a2048.game.di.appModule
import com.miss.a2048.game.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

const val NOTIFICATION_CHANNEL = "horo_games_notification"


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(appModule, dataModule)
        }
    }
}