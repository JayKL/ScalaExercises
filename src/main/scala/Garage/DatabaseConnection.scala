package Garage

import Garage.PROJ_CONSTANTS.mongoConnectionVal
import Garage.PROJ_CONSTANTS.mongoDatabase

class DatabaseConnection {


  def getConnectionVal(): String ={
    mongoConnectionVal
  }

  def getDatabaseVal(): String ={
    mongoDatabase
  }

}
