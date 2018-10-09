package game.entity

/**
 *
 *
 * Created by ashmelev on 10/8/18.
 */
abstract class NonPlayer : AbstractEntity() {
  abstract val isMonster: Boolean
}