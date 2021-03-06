package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdIndex extends js.Object {
  /**
    * Set format for the name of each data in tooltip. Specified function receives name, ratio, id and index of the data point to show. ratio will be undefined if the chart is not
    * donut/pie/gauge.
    */
  var name: js.UndefOr[
    js.Function4[/* name */ String, /* ratio */ Double, /* id */ String, /* index */ Double, String]
  ] = js.undefined
  /**
    * Set format for the title of tooltip. Specified function receives x of the data point to show.
    */
  var title: js.UndefOr[js.Function1[/* x */ js.Any, String]] = js.undefined
  /**
    * Set format for the value of each data in tooltip.
    * Specified function receives name, ratio, id and index of the data point to show. ratio will be undefined if the chart is not donut/pie/gauge.
    * If undefined returned, the row of that value will be skipped.
    */
  var value: js.UndefOr[
    js.Function4[/* value */ js.Any, /* ratio */ Double, /* id */ String, /* index */ Double, String]
  ] = js.undefined
}

object Anon_IdIndex {
  @scala.inline
  def apply(
    name: (/* name */ String, /* ratio */ Double, /* id */ String, /* index */ Double) => String = null,
    title: /* x */ js.Any => String = null,
    value: (/* value */ js.Any, /* ratio */ Double, /* id */ String, /* index */ Double) => String = null
  ): Anon_IdIndex = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(js.Any.fromFunction4(name))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction4(value))
    __obj.asInstanceOf[Anon_IdIndex]
  }
}

