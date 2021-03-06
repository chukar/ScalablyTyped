package typings.grommet

import typings.grommet.grommetStrings.Africa
import typings.grommet.grommetStrings.Asia
import typings.grommet.grommetStrings.Australia
import typings.grommet.grommetStrings.Europe
import typings.grommet.grommetStrings.`North America`
import typings.grommet.grommetStrings.`South America`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Africa extends js.Object {
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object Anon_Africa {
  @scala.inline
  def apply(
    name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`),
    color: String | Anon_Dark = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null
  ): Anon_Africa = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    __obj.asInstanceOf[Anon_Africa]
  }
}

