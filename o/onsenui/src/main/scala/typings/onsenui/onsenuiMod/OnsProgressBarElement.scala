package typings.onsenui.onsenuiMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsProgressBarElement extends HTMLElement {
  /**
    * @description If this property is `true`, an infinite looping animation will be shown.
    */
  var indeterminate: Boolean = js.native
  /**
    * @description Current secondary progress. Should be a value between 0 and 100.
    */
  var secondaryValue: Double = js.native
  /**
    * @description Current progress. Should be a value between 0 and 100.
    */
  var value: Double = js.native
}

