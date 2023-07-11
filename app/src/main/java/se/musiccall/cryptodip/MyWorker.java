package se.musiccall.cryptodip;

//https://github.com/firebase/quickstart-android/blob/7126776b306948574b89406a656101dd2c7bb8da/messaging/app/src/main/java/com/google/firebase/quickstart/fcm/java/MyWorker.java#L10

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import android.content.Context;

public class MyWorker extends Worker {

    private static final String TAG = "MyWorker";

    public MyWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d(TAG, "Performing long running task in scheduled job");
        // TODO(developer): add long running task here.
        return Result.success();
    }
}