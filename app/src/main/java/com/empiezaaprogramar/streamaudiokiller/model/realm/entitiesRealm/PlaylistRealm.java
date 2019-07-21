package com.empiezaaprogramar.streamaudiokiller.model.realm.entitiesRealm;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import lombok.Data;

@Data
@RealmClass
public class PlaylistRealm implements RealmModel {
    @PrimaryKey
    private int id;

    private String name;
    private RealmList<SongRealm> songs;
}
