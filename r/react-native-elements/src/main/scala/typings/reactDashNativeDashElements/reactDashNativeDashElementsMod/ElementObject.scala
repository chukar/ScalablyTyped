package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementObject extends js.Object {
  var element: ReactElement | ReactType[_]
}

object ElementObject {
  @scala.inline
  def apply(element: ReactElement | ReactType[_]): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementObject]
  }
}

