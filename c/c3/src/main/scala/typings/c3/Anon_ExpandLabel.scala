package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandLabel extends js.Object {
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Anon_Format] = js.undefined
  /**
    * Set title of donut chart.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Set width of donut chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_ExpandLabel {
  @scala.inline
  def apply(
    expand: js.UndefOr[Boolean] = js.undefined,
    label: Anon_Format = null,
    title: String = null,
    width: Int | Double = null
  ): Anon_ExpandLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpandLabel]
  }
}

