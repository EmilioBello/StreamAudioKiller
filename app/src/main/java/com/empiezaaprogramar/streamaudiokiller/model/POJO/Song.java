package com.empiezaaprogramar.streamaudiokiller.model.POJO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Song {
    private int id;

    private String name;
    private int duration;

    private String urlSong;

    private boolean downloaded;
}
