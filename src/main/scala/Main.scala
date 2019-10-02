import Garage.{Car, DatabaseConnection, ModelToDConv, MongoConnection}
import org.mongodb.scala.{MongoClient, MongoDatabase}

object Main extends App with ModelToDConv{
  val databaseConnectionRefVal=new DatabaseConnection
  val mongoConnection=new MongoConnection
  val mongoClient: MongoClient = MongoClient(databaseConnectionRefVal.getConnectionVal())
  val database: MongoDatabase = mongoClient.getDatabase(databaseConnectionRefVal.getDatabaseVal())
  mongoConnection.addDocument(convertCarToDoc(new Car("QA Car", 0, 1)),database.getCollection("Vehicles"))
  mongoConnection.get


  Thread.sleep(3000)
  mongoClient.close()
}