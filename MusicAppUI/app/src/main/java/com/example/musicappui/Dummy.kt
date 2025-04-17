package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_music_off_24, "Artist"),
    Lib(R.drawable.baseline_queue_music_24, "Album"),
    Lib(R.drawable.baseline_video_library_24, "Songs"),
    Lib(R.drawable.baseline_music_video_24, "Genre")
)
