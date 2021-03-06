package typings.atOracleOraclejet.ojcompositeMod

import typings.atOracleOraclejet.Anon_Path
import typings.atOracleOraclejet.atOracleOraclejetStrings.external
import typings.atOracleOraclejet.atOracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedContext extends js.Object {
  var previousValue: js.Any
  var property: String
  var subproperty: js.UndefOr[Anon_Path] = js.undefined
  var updatedFrom: external | internal
  var value: js.Any
}

object PropertyChangedContext {
  @scala.inline
  def apply(
    previousValue: js.Any,
    property: String,
    updatedFrom: external | internal,
    value: js.Any,
    subproperty: Anon_Path = null
  ): PropertyChangedContext = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (subproperty != null) __obj.updateDynamic("subproperty")(subproperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedContext]
  }
}

