package typings.gestalt.gestaltMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(children: ReactNode = null): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProps]
  }
}

