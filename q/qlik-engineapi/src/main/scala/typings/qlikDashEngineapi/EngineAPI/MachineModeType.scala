package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - CONNECT_DEFAULT: used internally
  * - CONNECT_64
  * - CONNECT_32
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_DEFAULT
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_64
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_32
*/
trait MachineModeType extends js.Object

object MachineModeType {
  @scala.inline
  def CONNECT_32: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_32 = this.cast("CONNECT_32")
  @scala.inline
  def CONNECT_64: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_64 = this.cast("CONNECT_64")
  @scala.inline
  def CONNECT_DEFAULT: typings.qlikDashEngineapi.qlikDashEngineapiStrings.CONNECT_DEFAULT = this.cast("CONNECT_DEFAULT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

