package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFirstParty extends js.Object {
  var all: Double
  var firstParty: Double
  var none: Double
  var preview: Double
  var `private`: Double
  var public: Double
  var released: Double
}

object Anon_AllFirstParty {
  @scala.inline
  def apply(
    all: Double,
    firstParty: Double,
    none: Double,
    preview: Double,
    `private`: Double,
    public: Double,
    released: Double
  ): Anon_AllFirstParty = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], firstParty = firstParty.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllFirstParty]
  }
}

