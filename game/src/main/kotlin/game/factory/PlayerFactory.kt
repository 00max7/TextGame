package game.factory

import game.entity.Player
import java.util.*

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
object PlayerFactory {
  private val rnd = Random()

  fun create(playerName: String): Player =
          Player(name = playerName, description = "You").apply {
            strength = randomInt(5, 15)
            health = randomInt(5, 15)
            agility = randomInt(5, 15)
            damage = randomInt(5, 15)
            skill = randomInt(5, 15)
            level = 1
            hitPoints = 20
          }

  private fun randomInt(min: Int, max: Int): Int =
          rnd.nextInt(max - min) + min
}