package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anim extends js.Object {
  var anim: RaphaelAnimation
  var status: Double
}

object Anon_Anim {
  @scala.inline
  def apply(anim: RaphaelAnimation, status: Double): Anon_Anim = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Anim]
  }
}

