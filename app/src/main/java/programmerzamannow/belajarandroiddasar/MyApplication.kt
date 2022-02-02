package programmerzamannow.belajarandroiddasar

import android.app.Application
import android.util.Log

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("APP", "Application Created")
    }
}