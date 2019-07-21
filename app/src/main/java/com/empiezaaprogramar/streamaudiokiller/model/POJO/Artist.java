package com.empiezaaprogramar.streamaudiokiller.model.POJO;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Artist {
    private int id;

    private String name;
    private String description;

    private List<Album> albums;
}
