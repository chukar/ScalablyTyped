package typings.atJupyterlabServices

import typings.atJupyterlabServices.atJupyterlabServicesStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var event: String
  var seq: Double
  var `type`: event
}

object Anon_Body {
  @scala.inline
  def apply(event: String, seq: Double, `type`: event, body: js.Any = null): Anon_Body = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

