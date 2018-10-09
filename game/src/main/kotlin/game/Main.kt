package game

import game.factory.RoomFactory.create
import game.io.saveRoom
import game.dungeon.Room

fun main(args: Array<String>) {
    println("Welcome to this game, what is your name?")
    val game = Game(readLine().toString())
    println("Welcome ${game.playerName}")
    create(1, 1)
    Room("Room1", "This is a room")
    saveRoom(, "src/room1.json")
}