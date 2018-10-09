package game.factory

import game.model.InventoryItem



/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
object ItemFactory {
  fun create(level: Int, room: Int, count: Int): List<InventoryItem> {
    val items = mutableListOf<InventoryItem>()

    for (i in 0 until count) {
      items.add(InventoryItem(name = "Item in room $room", description = "Item in room $room on level $level"))
    }

    return items
  }
}