package typings.atUifabricUtilities

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ComponentType[T]] = js.undefined
}

object Anon_DefaultRender {
  @scala.inline
  def apply[T](defaultRender: ComponentType[T] = null): Anon_DefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultRender[T]]
  }
}

