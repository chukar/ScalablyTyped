package typings.yup

import typings.yup.yupMod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Is extends js.Object {
  var is: WhenOptionsBuilderObjectIs
  var otherwise: js.Any
  var `then`: js.Any
}

object Anon_Is {
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any, is: WhenOptionsBuilderObjectIs = null): Anon_Is = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Is]
  }
}

