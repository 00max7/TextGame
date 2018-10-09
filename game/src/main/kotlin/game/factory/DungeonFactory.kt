package game.factory

import game.dungeon.Dungeon

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
object DungeonFactory {
  fun create(): Dungeon =
          Dungeon(LevelFactory.create(count = 10))
}