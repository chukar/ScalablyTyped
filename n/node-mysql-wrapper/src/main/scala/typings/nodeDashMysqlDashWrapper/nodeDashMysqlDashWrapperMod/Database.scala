package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import typings.mysql.mysqlMod.MysqlError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "Database")
@js.native
class Database () extends js.Object {
  def this(connection: Connection) = this()
  var connection: Connection = js.native
  var isReady: Boolean = js.native
  var readyListenerCallbacks: js.Array[js.Function] = js.native
  def buildRules(): SelectQueryRules = js.native
  def buildRules(parentRules: SelectQueryRules): SelectQueryRules = js.native
  def collection[T](tableName: String): ObservableCollection[T] = js.native
  def collection[T](tableName: String, callbackWhenReady: js.Function): ObservableCollection[T] = js.native
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * the difference from the 'end' is that this method doesn't care about errors so no callback passing here.
    */
  def destroy(): Unit = js.native
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * @param {function} maybeAcallbackError If error occurs when closing the connection, this callback has the responsibility to catch it.
    * @returnType {nothing}
    * @return {nothing}
    */
  def end(maybeAcallbackError: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def has(tableName: String): Boolean = js.native
  def has(tableName: String, functionName: String): Boolean = js.native
  /**Meteor js feature only: Returns a table which it's collection can make synchronization with the client */
  def meteorTable[T](tableName: String): MeteorTable[T] = js.native
  def newTableRules(tableName: String): SelectQueryRules = js.native
  def noticeReady(): Unit = js.native
  def query(queryStr: String, callback: js.Function2[/* err */ MysqlError, /* results */ js.Any, _]): Unit = js.native
  def query(
    queryStr: String,
    callback: js.Function2[/* err */ MysqlError, /* results */ js.Any, _],
    queryArguments: js.Array[_]
  ): Unit = js.native
  def ready(): Unit = js.native
  def ready(callback: js.Function0[Unit]): Unit = js.native
  def removeReadyListener(callback: js.Function0[Unit]): Unit = js.native
  def setConnection(connection: Connection): Unit = js.native
  def table[T](tableName: String): Table[T] = js.native
  /**
    * Force to use/fetch information from only certain of database's tables, otherwise all database's tables information will be fetched.
    * @param {Array} tables the array of the tables  {string}
    * @returnType {nothing}
    * @return {nothing}
    */
  def useOnly(useTables: js.Any*): Unit = js.native
}

/* static members */
@JSImport("node-mysql-wrapper", "Database")
@js.native
object Database extends js.Object {
  def when(_promises: typings.bluebird.bluebirdMod.^[_]*): typings.bluebird.bluebirdMod.^[_] = js.native
}

