package com.gksc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;

import io.dcloud.PandoraEntry;

public class EntryActivity extends PandoraEntry {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!Settings.canDrawOverlays(this)) {
            //位于应用之上权限
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, 100);
        }
    }
}
