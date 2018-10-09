package game.entity

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
class Monster : NonPlayer() {
  override val isMonster: Boolean
    get() = true
}