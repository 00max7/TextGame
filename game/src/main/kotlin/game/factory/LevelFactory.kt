package game.factory

import game.dungeon.Level


/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
object LevelFactory {
  fun create(count: Int) : List<Level> {
    val levels = mutableListOf<Level>()
    for (i in 0 until count) {
      levels.add(Level(RoomFactory.create(level = i, count = 10)))
    }

    return levels.toList()
  }
}