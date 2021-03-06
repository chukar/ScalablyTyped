package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.ConditionalRangeBorderData
import typings.officeDashJs.Excel.Interfaces.ConditionalRangeBorderLoadOptions
import typings.officeDashJs.Excel.Interfaces.ConditionalRangeBorderUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Continuous
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.DashDot
import typings.officeDashJs.officeDashJsStrings.DashDotDot
import typings.officeDashJs.officeDashJsStrings.Dot
import typings.officeDashJs.officeDashJsStrings.EdgeBottom
import typings.officeDashJs.officeDashJsStrings.EdgeLeft
import typings.officeDashJs.officeDashJsStrings.EdgeRight
import typings.officeDashJs.officeDashJsStrings.EdgeTop
import typings.officeDashJs.officeDashJsStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border of an object.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorder")
@js.native
class ConditionalRangeBorder () extends ClientObject {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalRangeBorder: RequestContext = js.native
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val sideIndex: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalRangeBorder = js.native
  def load(options: ConditionalRangeBorderLoadOptions): ConditionalRangeBorder = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ConditionalRangeBorder = js.native
  def load(propertyNames: String): ConditionalRangeBorder = js.native
  def load(propertyNames: js.Array[String]): ConditionalRangeBorder = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalRangeBorder): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ConditionalRangeBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalRangeBorderUpdateData): Unit = js.native
  def set(properties: ConditionalRangeBorderUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalRangeBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalRangeBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalRangeBorderData = js.native
}

