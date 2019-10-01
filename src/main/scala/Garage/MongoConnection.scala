package Garage

import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

class MongoConnection {
  val mongoClient: MongoClient = MongoClient("mongodb://localhost")
  val database: MongoDatabase = mongoClient.getDatabase("Garage")

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

  def deleteById(id: Int,inputCollection: MongoCollection[Document]) = {
    inputCollection.deleteOne(equal("_id", 1)).headOption().onComplete{
      case Success(value) => println("Completed")
      case Failure(error) => error.printStackTrace()
    }
  }



}
