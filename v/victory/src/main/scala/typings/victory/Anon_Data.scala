package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[CSSProperties] = js.undefined
  var labels: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: CSSProperties = null, labels: CSSProperties = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

