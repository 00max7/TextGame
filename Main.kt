package game

import game.factory.RoomFactory.create
import game.io.saveRoom
import game.dungeon.Room

fun main(args: Array<String>) {

    //name selection
    println("Welcome to this game, what is your name?")
    val game = Game(readLine().toString())
    println("Welcome ${game.playerName}")

    // room creation

    create(1, 1)
    val myRoom = Room("Room1", "This is a room", light = false)
    saveRoom(myRoom, "src/room1.json")
}