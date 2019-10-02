package Garage

import com.google.gson.Gson
import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object MongoConnection extends DatabaseConnection with App {
  val mongoClient: MongoClient = MongoClient(getConnection())
  val database: MongoDatabase = mongoClient.getDatabase(getDatabase())
  val gson=new Gson
  val modelToDConvRefVal = new ModelToDConv

  def addDocument(doc: Document,inputCollection: MongoCollection[Document]) = {
    inputCollection.insertOne(doc)
      .subscribe(new Observer[Completed] {
        override def onNext(result: Completed): Unit = println("Inserted")
        override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")
        override def onComplete(): Unit = println("Completed")
      })
  }

  def getAllDocuments(inputCollection: MongoCollection[Document]) = {
    inputCollection.find()
  }

  def deleteById(id: String,inputCollection: MongoCollection[Document]) = {
    inputCollection.deleteOne(equal("_id", id)).headOption().onComplete{
      case Success(value) => println("Completed")
      case Failure(error) => error.printStackTrace()
    }
  }


  val database2: MongoDatabase = mongoClient.getDatabase("FirstDB")

  addDocument(modelToDConvRefVal.convertCarToDoc(new Car("QA Car", 0, 1)),database.getCollection("Vehicles"))



  Thread.sleep(3000)
  mongoClient.close()

}
