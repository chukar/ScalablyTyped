package typings.bip32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Private extends js.Object {
  var `private`: Double
  var public: Double
}

object Anon_Private {
  @scala.inline
  def apply(`private`: Double, public: Double): Anon_Private = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Private]
  }
}

