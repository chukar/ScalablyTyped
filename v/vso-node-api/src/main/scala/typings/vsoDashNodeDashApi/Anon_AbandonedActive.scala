package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbandonedActive extends js.Object {
  var abandoned: Double
  var active: Double
  var all: Double
  var completed: Double
  var notSet: Double
}

object Anon_AbandonedActive {
  @scala.inline
  def apply(abandoned: Double, active: Double, all: Double, completed: Double, notSet: Double): Anon_AbandonedActive = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AbandonedActive]
  }
}

