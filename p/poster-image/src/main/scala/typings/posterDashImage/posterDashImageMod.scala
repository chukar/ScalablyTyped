package typings.posterDashImage

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poster-image", JSImport.Namespace)
@js.native
object posterDashImageMod extends js.Object {
  def apply(file: Blob): js.Promise[Blob] = js.native
  def apply(file: File): js.Promise[Blob] = js.native
}

