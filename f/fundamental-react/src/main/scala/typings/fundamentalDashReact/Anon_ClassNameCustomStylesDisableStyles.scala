package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameCustomStylesDisableStyles extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClassNameCustomStylesDisableStyles {
  @scala.inline
  def apply(
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined
  ): Anon_ClassNameCustomStylesDisableStyles = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameCustomStylesDisableStyles]
  }
}

