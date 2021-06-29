package com.example.android.devbyteviewer.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class RefreshDataWorker(appContext: Context, parans: WorkerParameters) : CoroutineWorker(appContext, parans) {
    override suspend fun doWork(): Result {
        return Result.success()
    }
}