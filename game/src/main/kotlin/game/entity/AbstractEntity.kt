package game.entity

import game.model.InventoryHolder


/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
abstract class AbstractEntity(val name: String = "Unknown",
                              val description: String = "Unknown",
                              var strength: Int = 0,
                              var health: Int = 0,
                              var agility: Int = 0,
                              var damage: Int = 0,
                              var skill: Int = 0,
                              var level: Int = 0,
                              var hitPoints: Int = 20) : InventoryHolder()