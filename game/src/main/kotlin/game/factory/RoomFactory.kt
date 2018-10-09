package game.factory

import game.dungeon.Room

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
object RoomFactory {
  fun create(level: Int, count: Int): List<Room> {
    val rooms = mutableListOf<Room>()

    for (i in 0 until count) {
      rooms.add(createRoom(level, i))
    }
    return rooms
  }

  private fun createRoom(level: Int, i: Int): Room {
    return Room(name = "Room $i", description = "Room $i, on level $level").apply {
      items = ItemFactory.create(level = level, room = i, count = 10)
    }
  }
}