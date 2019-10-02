package Garage

import Garage.PROJ_CONSTANTS.mongoConnectionVal
import Garage.PROJ_CONSTANTS.mongoDatabase

class DatabaseConnection {


  def getConnection(): String ={
    mongoConnectionVal
  }

  def getDatabase(): String ={
    mongoDatabase
  }

}
