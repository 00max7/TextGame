package game.entity

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
class Guide : NonPlayer() {
  override val isMonster: Boolean
    get() = false
}