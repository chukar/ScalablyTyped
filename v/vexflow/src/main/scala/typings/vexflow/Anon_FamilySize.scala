package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilySize extends js.Object {
  var family: String
  var size: Double
  var weight: String
}

object Anon_FamilySize {
  @scala.inline
  def apply(family: String, size: Double, weight: String): Anon_FamilySize = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FamilySize]
  }
}

