package typings.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.SimpleType")
@js.native
abstract class SimpleType protected () extends Type {
  /**
    * Constructor for a new SimpleType.
    * @param oFormatOptions options as provided by concrete subclasses
    * @param oConstraints constraints as supported by concrete subclasses
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
    * Format the given value in model representation to an output value in the giveninternal type. This
    * happens according to the format options, if target type is 'string'.If oValue is not defined or
    * null, null will be returned.
    * @param oValue the value to be formatted
    * @param sInternalType the target type
    * @returns the formatted output value
    */
  def formatValue(oValue: js.Any, sInternalType: String): js.Any = js.native
  /**
    * Parse a value of an internal type to the expected value of the model type.
    * @param oValue the value to be parsed
    * @param sInternalType the source type
    * @returns the parse result
    */
  def parseValue(oValue: js.Any, sInternalType: String): js.Any = js.native
  def parseValue(oValue: js.Any, sInternalType: String, aCurrentValues: js.Array[_]): js.Any = js.native
  /**
    * Validate whether a given value in model representation is valid and meets thedefined constraints (if
    * any).
    * @param oValue the value to be validated
    */
  def validateValue(oValue: js.Any): Unit = js.native
}

