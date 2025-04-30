package com.example.song.nevigation


sealed class Screen(val route: String) {
    object SongList : Screen("song_list")
    object Player : Screen("player/{songTitle}/{resId}") {
        fun createRoute(songTitle: String, resId: Int) = "player/$songTitle/$resId"
    }
}
