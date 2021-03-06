package typings.angularDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularModal {
  import org.scalablytyped.runtime.Instantiable1
  import typings.angular.JQuery
  import typings.std.Element

  type AngularModalControllerDefinition = (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Function | String
  type AngularModalFactory = js.Function1[
    /* settings */ AngularModalSettingsWithTemplate | AngularModalSettingsWithTemplateUrl, 
    AngularModal
  ]
  type AngularModalJQuerySelector = String | Element | (js.Array[js.Any | Element]) | JQuery | js.Function | js.Object
}
