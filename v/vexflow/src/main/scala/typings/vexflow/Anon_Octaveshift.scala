package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Octaveshift extends js.Object {
  var octave_shift: js.UndefOr[Double] = js.undefined
}

object Anon_Octaveshift {
  @scala.inline
  def apply(octave_shift: Int | Double = null): Anon_Octaveshift = {
    val __obj = js.Dynamic.literal()
    if (octave_shift != null) __obj.updateDynamic("octave_shift")(octave_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Octaveshift]
  }
}

