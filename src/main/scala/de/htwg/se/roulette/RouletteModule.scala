package de.htwg.se.roulette

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

class RouletteModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    //bind[ControllerInterface].to[controller.controllerComponent.controllerBaseImpl.Controller]
    //bind[FileIOInterface].toInstance(new model.fileIoComponent.fileIoJsonImpl.FileIO)
    //bind[FileIOInterface].toInstance(new model.fileIoComponent.fileIoXmlImpl.FileIO)
  }

}
