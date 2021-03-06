package typings.expressDashMyconnection

import typings.mysql.mysqlMod.Connection
import typings.mysql.mysqlMod.ConnectionConfig
import typings.mysql.mysqlMod.Pool
import typings.mysql.mysqlMod.PoolCluster
import typings.mysql.mysqlMod.PoolClusterConfig
import typings.mysql.mysqlMod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmysql extends js.Object {
  def createConnection(connectionUri: String): Connection = js.native
  def createConnection(connectionUri: ConnectionConfig): Connection = js.native
  def createPool(config: String): Pool = js.native
  def createPool(config: PoolConfig): Pool = js.native
  def createPoolCluster(): PoolCluster = js.native
  def createPoolCluster(config: PoolClusterConfig): PoolCluster = js.native
  def escape(value: js.Any): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
  def escapeId(value: String): String = js.native
  def escapeId(value: String, forbidQualified: Boolean): String = js.native
  def format(sql: String, values: js.Array[_]): String = js.native
  def format(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
  def format(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
  def raw(sql: String): js.Function0[String] = js.native
}

