package typings.libratoDashNode.libratoDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", "timing")
@js.native
object timing extends js.Object {
  def apply(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit]): Unit = js.native
  def apply(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def apply(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit], opts: CustomSource): Unit = js.native
  def apply(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
}

