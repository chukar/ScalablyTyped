package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify developer metadata. To create new developer metadata use Range.addDeveloperMetadata(key), Sheet.addDeveloperMetadata(key), or Spreadsheet.addDeveloperMetadata(key).
  */
trait DeveloperMetadata extends js.Object {
  def getId(): Integer
  def getKey(): String
  def getLocation(): DeveloperMetadataLocation
  def getValue(): String | Null
  def getVisibility(): DeveloperMetadataVisibility
  def moveToColumn(column: Range): DeveloperMetadata
  def moveToRow(row: Range): DeveloperMetadata
  def moveToSheet(sheet: Sheet): DeveloperMetadata
  def moveToSpreadsheet(): DeveloperMetadata
  def remove(): Unit
  def setKey(key: String): DeveloperMetadata
  def setValue(value: String): DeveloperMetadata
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: () => Integer,
    getKey: () => String,
    getLocation: () => DeveloperMetadataLocation,
    getValue: () => String | Null,
    getVisibility: () => DeveloperMetadataVisibility,
    moveToColumn: Range => DeveloperMetadata,
    moveToRow: Range => DeveloperMetadata,
    moveToSheet: Sheet => DeveloperMetadata,
    moveToSpreadsheet: () => DeveloperMetadata,
    remove: () => Unit,
    setKey: String => DeveloperMetadata,
    setValue: String => DeveloperMetadata,
    setVisibility: DeveloperMetadataVisibility => DeveloperMetadata
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getKey = js.Any.fromFunction0(getKey), getLocation = js.Any.fromFunction0(getLocation), getValue = js.Any.fromFunction0(getValue), getVisibility = js.Any.fromFunction0(getVisibility), moveToColumn = js.Any.fromFunction1(moveToColumn), moveToRow = js.Any.fromFunction1(moveToRow), moveToSheet = js.Any.fromFunction1(moveToSheet), moveToSpreadsheet = js.Any.fromFunction0(moveToSpreadsheet), remove = js.Any.fromFunction0(remove), setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue), setVisibility = js.Any.fromFunction1(setVisibility))
  
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

