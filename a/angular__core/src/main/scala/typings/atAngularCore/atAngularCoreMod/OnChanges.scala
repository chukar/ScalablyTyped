package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChanges extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  def ngOnChanges(changes: SimpleChanges): Unit
}

object OnChanges {
  @scala.inline
  def apply(ngOnChanges: SimpleChanges => Unit): OnChanges = {
    val __obj = js.Dynamic.literal(ngOnChanges = js.Any.fromFunction1(ngOnChanges))
  
    __obj.asInstanceOf[OnChanges]
  }
}

