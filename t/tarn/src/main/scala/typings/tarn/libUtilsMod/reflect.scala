package typings.tarn.libUtilsMod

import typings.tarn.libPromiseInspectionMod.PromiseInspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/utils", "reflect")
@js.native
object reflect extends js.Object {
  def apply[T](promise: js.Promise[T]): js.Promise[PromiseInspection[js.Object | T]] = js.native
}

