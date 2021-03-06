package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.SlicerData
import typings.officeDashJs.Excel.Interfaces.SlicerLoadOptions
import typings.officeDashJs.Excel.Interfaces.SlicerUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.ClientResult
import typings.officeDashJs.OfficeExtension.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Ascending
import typings.officeDashJs.officeDashJsStrings.DataSourceOrder
import typings.officeDashJs.officeDashJsStrings.Descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a slicer object in the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.Slicer")
@js.native
class Slicer () extends ClientObject {
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Slicer: RequestContext = js.native
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: Double = js.native
  /**
    *
    * Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val id: String = js.native
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi 1.10]
    */
  val isFilterCleared: Boolean = js.native
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: Double = js.native
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: String = js.native
  /**
    *
    * Represents the collection of SlicerItems that are part of the slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val slicerItems: SlicerItemCollection = js.native
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: SlicerSortType | DataSourceOrder | Ascending | Descending = js.native
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: String = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: Double = js.native
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: Double = js.native
  /**
    *
    * Represents the worksheet containing the slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Clears all the filters currently applied on the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  def clearFilters(): Unit = js.native
  /**
    *
    * Deletes the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  /**
    *
    * Returns an array of selected items' keys. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getSelectedItems(): ClientResult[js.Array[String]] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Slicer = js.native
  def load(options: SlicerLoadOptions): Slicer = js.native
  def load(propertyNamesAndPaths: Anon_Expand): Slicer = js.native
  def load(propertyNames: String): Slicer = js.native
  def load(propertyNames: js.Array[String]): Slicer = js.native
  /**
    *
    * Selects slicer items based on their keys. The previous selections are cleared.
    All items will be selected by default if the array is empty.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param items Optional. The specified slicer item names to be selected.
    */
  def selectItems(): Unit = js.native
  def selectItems(items: js.Array[String]): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Slicer): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SlicerUpdateData): Unit = js.native
  def set(properties: SlicerUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Slicer): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Slicer object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlicerData = js.native
}

