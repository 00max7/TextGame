package game.io

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import game.Game
import game.dungeon.Room
import java.io.File

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */

private val gson: Gson = GsonBuilder().setLenient().create()

fun saveGame(game: Game, filepath: String) {
  File(filepath).printWriter().use { out ->
    out.print(gson.toJson(game))
  }
}

fun saveRoom(room: Room, filepath: String) {
  File(filepath).printWriter().use { out ->
    out.print(gson.toJson(room))
  }
}

fun restoreGame(filepath: String): Game =
        gson.fromJson(File(filepath).readText(Charsets.UTF_8), Game::class.java)
