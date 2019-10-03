import Garage.{Car, DatabaseConnection, Garage, GarageInit, ModelToDConv, MongoConnection}
import org.mongodb.scala.{Document, FindObservable, MongoClient, MongoDatabase}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App with ModelToDConv{
  val databaseConnectionRefVal=new DatabaseConnection
  val mongoConnection=new MongoConnection
  val mongoClient: MongoClient = MongoClient(databaseConnectionRefVal.getConnectionVal())
  val database: MongoDatabase = mongoClient.getDatabase(databaseConnectionRefVal.getDatabaseVal())
//  mongoConnection.addDocument(convertCarToDoc(new Car("QA Car", 0, 1)),database.getCollection("Vehicles"))

 // val garageRefVal = new Garage()
 // print(garageRefVal.listOfVehiclesFuture)

 // val yz: FindObservable[Document] =mongoConnection.getAllDocuments(database.getCollection("Vehicles"))



 // mongoConnection.getById(1, database.getCollection("Vehicles"))

  val x: GarageInit = new GarageInit



  Thread.sleep(3000)
  mongoClient.close()
}