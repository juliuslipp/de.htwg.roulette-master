package de.htwg.se.roulette.controller.controllerComponent
import de.htwg.se.roulette.controller.controllerComponent._
import de.htwg.se.roulette.controller.controllerComponent.GameStatus.GameStatus
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Player
import de.htwg.se.roulette.model.gameComponent.tableInterface

import scala.swing.Publisher
trait ControllerInterface extends Publisher {

  def getbankmoney: Int

  def bankmoney: Int

  def statusText: String

  def createNewPlayer(name: String, bet: String, bankmoney: Int): Unit

  def set(bankmoney: Int): Unit

  def changeBet(newBet: String): Unit

  def undo: Unit

  def redo: Unit

  def gameStatus:GameStatus

  def name:String

  def bet:String
}

  import scala.swing.event.Event

  class CellChange extends Event
  class EventHappens extends Event
