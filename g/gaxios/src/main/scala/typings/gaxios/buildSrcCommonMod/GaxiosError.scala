package typings.gaxios.buildSrcCommonMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/common", "GaxiosError")
@js.native
class GaxiosError[T] protected () extends Error {
  def this(message: String, options: GaxiosOptions, response: GaxiosResponse[T]) = this()
  var code: js.UndefOr[String] = js.native
  var config: GaxiosOptions = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: js.UndefOr[GaxiosResponse[T]] = js.native
}

