package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuery[T] extends js.Object {
  var _table: Table[T] = js.native
  def execute(rawCriteria: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def execute(rawCriteria: js.Any, callback: js.Function1[/* _results */ js.Any, _]): typings.bluebird.bluebirdMod.^[_] = js.native
}

