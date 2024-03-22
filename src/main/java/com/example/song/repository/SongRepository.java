package com.example.song.repository;

//package com.example.song.repository;

//package com.example.song.repository.*;

import java.util.ArrayList;
import com.example.song.model.*;

public interface SongRepository {
    public ArrayList<Song> getSongs();

    public Song getSongById(int songId);
}
