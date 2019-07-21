package com.empiezaaprogramar.streamaudiokiller.model.realm.entitiesRealm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import lombok.Data;

@Data
@RealmClass
public class SongRealm implements RealmModel {
    @PrimaryKey
    private int id;

    private String name;
    private int duration;

    private String urlSong;

    private boolean downloaded;
}
