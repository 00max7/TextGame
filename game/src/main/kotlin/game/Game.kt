package game


import com.google.gson.Gson
import com.google.gson.GsonBuilder
import game.dungeon.Dungeon
import game.entity.Player
import game.factory.DungeonFactory
import game.factory.PlayerFactory

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
class Game(val playerName: String) {
  companion object {
    private val gson: Gson = GsonBuilder().setLenient().create()
  }
  val dungeon: Dungeon = DungeonFactory.create()
  val player: Player = PlayerFactory.create(playerName)
}

