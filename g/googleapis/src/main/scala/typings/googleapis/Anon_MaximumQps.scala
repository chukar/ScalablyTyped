package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MaximumQps extends js.Object {
  var maximumQps: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_MaximumQps {
  @scala.inline
  def apply(maximumQps: Int | Double = null, region: String = null, url: String = null): Anon_MaximumQps = {
    val __obj = js.Dynamic.literal()
    if (maximumQps != null) __obj.updateDynamic("maximumQps")(maximumQps.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumQps]
  }
}

