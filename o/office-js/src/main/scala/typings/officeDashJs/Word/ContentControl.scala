package typings.officeDashJs.Word

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Anon_IgnorePunct
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.ClientResult
import typings.officeDashJs.OfficeExtension.UpdateOptions
import typings.officeDashJs.Word.Interfaces.ContentControlData
import typings.officeDashJs.Word.Interfaces.ContentControlLoadOptions
import typings.officeDashJs.Word.Interfaces.ContentControlUpdateData
import typings.officeDashJs.officeDashJsStrings.After
import typings.officeDashJs.officeDashJsStrings.Before
import typings.officeDashJs.officeDashJsStrings.BoundingBox
import typings.officeDashJs.officeDashJsStrings.BuildingBlockGallery
import typings.officeDashJs.officeDashJsStrings.CheckBox
import typings.officeDashJs.officeDashJsStrings.ComboBox
import typings.officeDashJs.officeDashJsStrings.Content
import typings.officeDashJs.officeDashJsStrings.DatePicker
import typings.officeDashJs.officeDashJsStrings.DropDownList
import typings.officeDashJs.officeDashJsStrings.End
import typings.officeDashJs.officeDashJsStrings.Hidden
import typings.officeDashJs.officeDashJsStrings.Line
import typings.officeDashJs.officeDashJsStrings.Next
import typings.officeDashJs.officeDashJsStrings.Page
import typings.officeDashJs.officeDashJsStrings.Picture
import typings.officeDashJs.officeDashJsStrings.PlainText
import typings.officeDashJs.officeDashJsStrings.PlainTextInline
import typings.officeDashJs.officeDashJsStrings.PlainTextParagraph
import typings.officeDashJs.officeDashJsStrings.RepeatingSection
import typings.officeDashJs.officeDashJsStrings.Replace
import typings.officeDashJs.officeDashJsStrings.RichText
import typings.officeDashJs.officeDashJsStrings.RichTextInline
import typings.officeDashJs.officeDashJsStrings.RichTextParagraphs
import typings.officeDashJs.officeDashJsStrings.RichTextTable
import typings.officeDashJs.officeDashJsStrings.RichTextTableCell
import typings.officeDashJs.officeDashJsStrings.RichTextTableRow
import typings.officeDashJs.officeDashJsStrings.SectionContinuous
import typings.officeDashJs.officeDashJsStrings.SectionEven
import typings.officeDashJs.officeDashJsStrings.SectionNext
import typings.officeDashJs.officeDashJsStrings.SectionOdd
import typings.officeDashJs.officeDashJsStrings.Select
import typings.officeDashJs.officeDashJsStrings.Start
import typings.officeDashJs.officeDashJsStrings.Tags
import typings.officeDashJs.officeDashJsStrings.Unknown_
import typings.officeDashJs.officeDashJsStrings.Whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a content control. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.ContentControl")
@js.native
class ContentControl () extends ClientObject {
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: ContentControlAppearance | BoundingBox | Tags | Hidden = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: Boolean = js.native
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: String = js.native
  /**
    *
    * Gets the collection of content control objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ContentControl: RequestContext = js.native
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  /**
    *
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val id: Double = js.native
  /**
    *
    * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  /**
    *
    * Gets the collection of list objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val lists: ListCollection = js.native
  /**
    *
    * Get the collection of paragraph objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  /**
    *
    * Gets the parent body of the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  /**
    *
    * Gets the content control that contains the content control. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  /**
    *
    * Gets the content control that contains the content control. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
    *
    * Gets the table that contains the content control. Throws an error if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the table cell that contains the content control. Throws an error if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  /**
    *
    * Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
    *
    * Gets the table that contains the content control. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: String = js.native
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: Boolean = js.native
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ js.Any = js.native
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val subtype: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = js.native
  /**
    *
    * Gets the collection of table objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: String = js.native
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: String = js.native
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val `type`: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = js.native
  /**
    *
    * Clears the contents of the content control. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    *
    * Deletes the content control and its content. If keepContent is set to true, the content is not deleted.
    *
    * [Api set: WordApi 1.1]
    *
    * @param keepContent Required. Indicates whether the content should be deleted with the content control. If keepContent is set to true, the content is not deleted.
    */
  def delete(keepContent: Boolean): Unit = js.native
  /**
    *
    * Gets an HTML representation of the content control object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word for the web, etc.). If you need exact fidelity, or consistency across platforms, use `ContentControl.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  /**
    *
    * Gets the Office Open XML (OOXML) representation of the content control object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  /**
    *
    * Gets the whole content control, or the starting or ending point of the content control, as a range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: Whole): Range = js.native
  /**
    *
    * Gets the text ranges in the content control by using punctuation marks and/or other ending marks.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def getTextRanges(endingMarks: js.Array[String]): RangeCollection = js.native
  def getTextRanges(endingMarks: js.Array[String], trimSpacing: Boolean): RangeCollection = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. This method cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. Type of break.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Before | After | Start | End | Replace
  ): Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. This method cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. Type of break.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): Unit = js.native
  /**
    *
    * Inserts a document into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(base64File: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts a document into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(base64File: String, insertLocation: Before): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(base64File: String, insertLocation: End): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(base64File: String, insertLocation: Replace): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(base64File: String, insertLocation: Start): Range = js.native
  /**
    *
    * Inserts HTML into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts HTML into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  @JSName("insertHtml")
  def insertHtml_Before(html: String, insertLocation: Before): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(html: String, insertLocation: End): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(html: String, insertLocation: Replace): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(html: String, insertLocation: Start): Range = js.native
  /**
    *
    * Inserts an inline picture into the content control at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: String, insertLocation: After): InlinePicture = js.native
  /**
    *
    * Inserts an inline picture into the content control at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(base64EncodedImage: String, insertLocation: Before): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(base64EncodedImage: String, insertLocation: End): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(base64EncodedImage: String, insertLocation: Replace): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(base64EncodedImage: String, insertLocation: Start): InlinePicture = js.native
  /**
    *
    * Inserts OOXML into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts OOXML into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(ooxml: String, insertLocation: Before): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(ooxml: String, insertLocation: End): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(ooxml: String, insertLocation: Replace): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(ooxml: String, insertLocation: Start): Range = js.native
  /**
    *
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    */
  def insertParagraph(paragraphText: String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: String, insertLocation: After): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: String, insertLocation: Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: String, insertLocation: End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: String, insertLocation: Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: String, insertLocation: Start): Paragraph = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns into, or next to, a content control.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: InsertLocation): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After, values: js.Array[js.Array[String]]): Table = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns into, or next to, a content control.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before): Table = js.native
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start, values: js.Array[js.Array[String]]): Table = js.native
  /**
    *
    * Inserts text into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. The text to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertText(text: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(text: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts text into the content control at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. The text to be inserted in to the content control.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  @JSName("insertText")
  def insertText_Before(text: String, insertLocation: Before): Range = js.native
  @JSName("insertText")
  def insertText_End(text: String, insertLocation: End): Range = js.native
  @JSName("insertText")
  def insertText_Replace(text: String, insertLocation: Replace): Range = js.native
  @JSName("insertText")
  def insertText_Start(text: String, insertLocation: Start): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.ContentControl` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.ContentControl` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.ContentControl` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ContentControl = js.native
  def load(option: String): ContentControl = js.native
  def load(option: js.Array[String]): ContentControl = js.native
  def load(option: Anon_Expand): ContentControl = js.native
  def load(option: ContentControlLoadOptions): ContentControl = js.native
  /**
    *
    * Performs a search with the specified SearchOptions on the scope of the content control object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: Anon_IgnorePunct): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
    *
    * Selects the content control. This causes Word to scroll to the selection.
    *
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  @JSName("select")
  def select_End(selectionMode: End): Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: Select): Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: Start): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ContentControl): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.ContentControl): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ContentControlUpdateData): Unit = js.native
  def set(properties: ContentControlUpdateData, options: UpdateOptions): Unit = js.native
  /**
    *
    * Splits the content control into child ranges by using delimiters.
    *
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[String]): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Boolean, trimDelimiters: Boolean): RangeCollection = js.native
  def split(
    delimiters: js.Array[String],
    multiParagraphs: Boolean,
    trimDelimiters: Boolean,
    trimSpacing: Boolean
  ): RangeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.ContentControl object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ContentControlData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ContentControlData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): ContentControl = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): ContentControl = js.native
}

