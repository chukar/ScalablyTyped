package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DotsDuration extends js.Object {
  var dots: Double
  var duration: String
  var ticks: Double
  var `type`: String
}

object Anon_DotsDuration {
  @scala.inline
  def apply(dots: Double, duration: String, ticks: Double, `type`: String): Anon_DotsDuration = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DotsDuration]
  }
}

