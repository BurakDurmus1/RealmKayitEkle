package com.example.realmkayitekleme;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // The default Realm file is "default.realm" in Context.getFilesDir();
        // we'll change it to "myrealm.realm"
        Realm.init(this);
        //RealmConfiguration config = new RealmConfiguration.Builder().allowQueriesOnUiThread(true).name("realmKayitSil").build();
        RealmConfiguration config = new RealmConfiguration.Builder().allowWritesOnUiThread(true).name("realmKayitEkle").build();
         //RealmConfiguration.Builder.allowWritesOnUiThread(true)
        Realm.setDefaultConfiguration(config);
    }
}
