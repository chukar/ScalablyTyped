package typings.atOracleOraclejet.ojmenuselectmanyMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojmenuselectmanyMod.ojMenuSelectMany.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSelectManySettableProperties extends JetSettableProperties {
  var disabled: Boolean
  var options: js.Array[Option] | (DataProvider[_, _]) | Null
  var value: js.Array[_]
}

object ojMenuSelectManySettableProperties {
  @scala.inline
  def apply(disabled: Boolean, value: js.Array[_], options: js.Array[Option] | (DataProvider[_, _]) = null): ojMenuSelectManySettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSelectManySettableProperties]
  }
}

