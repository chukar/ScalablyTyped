package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  /**
    * The back of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var back: js.UndefOr[String] = js.undefined
  /**
    * The front of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var front: js.UndefOr[String] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(back: String = null, front: String = null): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Back]
  }
}

