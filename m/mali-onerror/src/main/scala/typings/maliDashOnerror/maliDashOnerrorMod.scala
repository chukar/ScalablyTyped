package typings.maliDashOnerror

import typings.mali.maliMod.Context
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-onerror", JSImport.Namespace)
@js.native
object maliDashOnerrorMod extends js.Object {
  def apply(fn: js.Function2[/* err */ Error, /* ctx */ Context, _]): js.Function2[
    /* ctx */ Context, 
    /* next */ js.UndefOr[js.Function0[js.Promise[_]]], 
    js.Promise[Unit]
  ] = js.native
}

