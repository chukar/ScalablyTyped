package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstOriginalEvent extends js.Object {
  var first: Double
  var originalEvent: Event
  var rows: Double
}

object Anon_FirstOriginalEvent {
  @scala.inline
  def apply(first: Double, originalEvent: Event, rows: Double): Anon_FirstOriginalEvent = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FirstOriginalEvent]
  }
}

