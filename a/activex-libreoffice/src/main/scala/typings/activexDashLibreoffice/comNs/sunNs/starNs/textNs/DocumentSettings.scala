package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.Settings
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes properties that apply to the whole text document. */
trait DocumentSettings
  extends Settings
     with PrintSettings {
  /**
    * specifies if paragraph and table spacing is added at the bottom of table cells
    *
    * This property controls, if the spacing of the last paragraph respectively table of a table cell is added at the bottom of this table cells If `TRUE`
    * (default for documents since OpenOffice.org 2.0), the spacing of the last paragraph respectively table of a table cell is added at the bottom of this
    * table cell. If `FALSE` (typically for documents till OpenOffice.org 1.1), the spacing of the last paragraph respectively table of a table cell isn't
    * added at the bottom of this table cell.
    * @since OOo 2.0
    */
  var AddParaSpacingToTableCells: Boolean
  /**
    * specifies if spacing between paragraphs and tables is to be added.
    *
    * If between two paragraphs, two tables, or a paragraph and a table, you have defined spacing above and below each object, usually only the larger one
    * of the two spaces is used. If the spacing between the objects are to be added this property has to be `TRUE` .
    */
  var AddParaTableSpacing: Boolean
  /**
    * specifies if top paragraph spacing is applied to paragraphs on the first page of text documents.
    *
    * If `TRUE` , the paragraph or table spacing to the top will also be effective at the beginning of a page or column if the paragraph or table is
    * positioned on the first page of the document. The same applies for a page break.
    */
  var AddParaTableSpacingAtStart: Boolean
  /**
    * specifies the alignment of tab stops in text documents.
    *
    * If `TRUE` centered and right-aligned paragraphs containing tabs are formatted as a whole in the center or aligned to the right. If `FALSE` , only the
    * text to the right of the last tab, for example, is aligned to the right, while the text to the left remains where it is.
    */
  var AlignTabStopPosition: Boolean
  /**
    * specifies if charts in text documents are updated automatically.
    *
    * This has no effect if "FieldAutoUpdate" is `FALSE` .
    */
  var ChartAutoUpdate: Boolean
  /**
    * specifies if the text wrap of floating screen objects are considered in a specified way in the positioning algorithm.
    *
    * This property controls how floating screen objects (Writer fly frames and drawing objects) are positioned. If `TRUE` , the object positioning
    * algorithm will consider the text wrap style, set at the floating screen object. The attribute {@link BaseFrameProperties.WrapInfluenceOnPosition}
    * specifies how the text wrap is considered. If `FALSE` (default value), the former object positioning algorithm (known from OpenOffice.org 1.1) is
    * applied.
    * @since OOo 2.0
    */
  var ConsiderTextWrapOnObjPos: Boolean
  /**
    * specifies if the document has been created as a label document.
    *
    * This property indicates that the document contains multiple text frames and that the content of one frame is duplicated into the other frames by
    * internally linked text sections.
    */
  var IsLabelDocument: Boolean
  /**
    * specifies if Math objects should automatically vertically aligned to match the baseline of the surrounding text.
    *
    * If activated formula object that are anchored 'As Character' will be vertically aligned to have their baseline match with the one from the text.
    * @since OOo 3.4
    */
  var MathBaselineAlignment: Boolean
  /**
    * specifies if the contents of links in the global document are saved or not.
    *
    * This property applies only for master documents.
    *
    * **Note** : This name is a bit misleading, it should be something like `SaveLinkedDocumentContent` .
    */
  var SaveGlobalDocumentLinks: Boolean
  /**
    * specifies if the former (till OpenOffice.org 1.1) or the new line spacing formatting is applied.
    *
    * This property controls how a set line spacing at a paragraph influences the formatting of the text lines and the spacing between paragraphs. If `TRUE`
    * , the formatting till OpenOffice.org 1.1 is applied. This means, that a proportional line spacing is applied above and below a text line and that the
    * maximum of the line spacing value between two paragraph is added respectively reckoned up with the paragraph spacing (adding or reckoning up is
    * controlled by document option AddParaTableSpacing). If `FALSE` (default for documents since OpenOffice.org 2.0), a proportional line spacing is only
    * applied below a text line and it's always added to the paragraph spacing between two paragraphs.
    * @since OOo 2.0
    */
  var UseFormerLineSpacing: Boolean
  /**
    * specifies if the former (till OpenOffice.org 1.1) or the new object positioning is applied.
    *
    * This property controls how floating screen objects (Writer fly frames and drawing objects are positioned. If `TRUE` , the object positioning till
    * OpenOffice.org 1.1 is applied. This means, that the top of a paragraph, at which a floating screen object orients its vertical position, includes the
    * lower spacing and the line spacing of the previous paragraph. If `FALSE` (default for documents since OpenOffice.org 2.0), the top of a paragraph, at
    * which a floating screen object orients its vertical position, doesn't include the lower spacing and the line spacing of the previous paragraph.
    * @since OOo 2.0
    */
  var UseFormerObjectPositioning: Boolean
}

object DocumentSettings {
  @scala.inline
  def apply(
    AddExternalLeading: Boolean,
    AddParaSpacingToTableCells: Boolean,
    AddParaTableSpacing: Boolean,
    AddParaTableSpacingAtStart: Boolean,
    AlignTabStopPosition: Boolean,
    ApplyUserData: Boolean,
    AutoCalculate: Boolean,
    BitmapTableURL: String,
    CharacterCompressionType: Double,
    ChartAutoUpdate: Boolean,
    ColorTableURL: String,
    ConsiderTextWrapOnObjPos: Boolean,
    CurrentDatabaseCommand: String,
    CurrentDatabaseCommandType: Double,
    CurrentDatabaseDataSource: String,
    DashTableURL: String,
    DefaultTabStop: Double,
    EmbedFonts: Boolean,
    EmbedSystemFonts: Boolean,
    FieldAutoUpdate: Boolean,
    ForbiddenCharacters: XForbiddenCharacters,
    GradientTableURL: String,
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsLabelDocument: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    MathBaselineAlignment: Boolean,
    PrintAnnotationMode: NotePrintMode,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintEmptyPages: Boolean,
    PrintFaxName: String,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintPaperFromSetup: Boolean,
    PrintProspect: Boolean,
    PrintQuality: Double,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    SaveGlobalDocumentLinks: Boolean,
    SaveVersionOnClose: Boolean,
    UpdateFromTemplate: Boolean,
    UseFormerLineSpacing: Boolean,
    UseFormerObjectPositioning: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading, AddParaSpacingToTableCells = AddParaSpacingToTableCells, AddParaTableSpacing = AddParaTableSpacing, AddParaTableSpacingAtStart = AddParaTableSpacingAtStart, AlignTabStopPosition = AlignTabStopPosition, ApplyUserData = ApplyUserData, AutoCalculate = AutoCalculate, BitmapTableURL = BitmapTableURL, CharacterCompressionType = CharacterCompressionType, ChartAutoUpdate = ChartAutoUpdate, ColorTableURL = ColorTableURL, ConsiderTextWrapOnObjPos = ConsiderTextWrapOnObjPos, CurrentDatabaseCommand = CurrentDatabaseCommand, CurrentDatabaseCommandType = CurrentDatabaseCommandType, CurrentDatabaseDataSource = CurrentDatabaseDataSource, DashTableURL = DashTableURL, DefaultTabStop = DefaultTabStop, EmbedFonts = EmbedFonts, EmbedSystemFonts = EmbedSystemFonts, FieldAutoUpdate = FieldAutoUpdate, ForbiddenCharacters = ForbiddenCharacters, GradientTableURL = GradientTableURL, HatchTableURL = HatchTableURL, IsKernAsianPunctuation = IsKernAsianPunctuation, IsLabelDocument = IsLabelDocument, IsPrintBooklet = IsPrintBooklet, IsPrintBookletBack = IsPrintBookletBack, IsPrintBookletFront = IsPrintBookletFront, LineEndTableURL = LineEndTableURL, LinkUpdateMode = LinkUpdateMode, MathBaselineAlignment = MathBaselineAlignment, PrintAnnotationMode = PrintAnnotationMode, PrintBlackFonts = PrintBlackFonts, PrintControls = PrintControls, PrintDrawings = PrintDrawings, PrintEmptyPages = PrintEmptyPages, PrintFaxName = PrintFaxName, PrintGraphics = PrintGraphics, PrintLeftPages = PrintLeftPages, PrintPageBackground = PrintPageBackground, PrintPaperFromSetup = PrintPaperFromSetup, PrintProspect = PrintProspect, PrintQuality = PrintQuality, PrintReversed = PrintReversed, PrintRightPages = PrintRightPages, PrintTables = PrintTables, PrinterIndependentLayout = PrinterIndependentLayout, PrinterName = PrinterName, PrinterSetup = PrinterSetup, PropertySetInfo = PropertySetInfo, SaveGlobalDocumentLinks = SaveGlobalDocumentLinks, SaveVersionOnClose = SaveVersionOnClose, UpdateFromTemplate = UpdateFromTemplate, UseFormerLineSpacing = UseFormerLineSpacing, UseFormerObjectPositioning = UseFormerObjectPositioning, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DocumentSettings]
  }
}

