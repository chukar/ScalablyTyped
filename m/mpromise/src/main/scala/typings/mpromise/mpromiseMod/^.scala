package typings.mpromise.mpromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mpromise", JSImport.Namespace)
@js.native
class ^[F, R] () extends Promise[F, R] {
  def this(fn: IResolveFunction[F, R]) = this()
}

@JSImport("mpromise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var FAILURE: String = js.native
  var SUCCESS: String = js.native
}

