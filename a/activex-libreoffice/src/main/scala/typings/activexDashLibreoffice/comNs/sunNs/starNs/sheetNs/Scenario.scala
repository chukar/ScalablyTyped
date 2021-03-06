package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a scenario in a spreadsheet document. */
trait Scenario
  extends XScenario
     with XScenarioEnhanced
     with XPropertySet
     with XNamed {
  /** specifies the color of the border of the scenario. */
  var BorderColor: Double
  /** specifies if the data should be copied back into the scenario. */
  var CopyBack: Boolean
  /** specifies if the formulas are copied or only the results. */
  var CopyFormulas: Boolean
  /** specifies if the styles are copied. */
  var CopyStyles: Boolean
  /** specifies if the scenario is active. */
  var IsActive: Boolean
  /** specifies if the scenario prints a border. */
  var PrintBorder: Boolean
  /** specifies if the scenario is protected. */
  var Protected: Boolean
  /** specifies if the scenario shows a border. */
  var ShowBorder: Boolean
}

object Scenario {
  @scala.inline
  def apply(
    BorderColor: Double,
    CopyBack: Boolean,
    CopyFormulas: Boolean,
    CopyStyles: Boolean,
    IsActive: Boolean,
    IsScenario: Boolean,
    Name: String,
    PrintBorder: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Protected: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    ScenarioComment: String,
    ShowBorder: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRanges: () => SafeArray[CellRangeAddress],
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setScenarioComment: String => Unit
  ): Scenario = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor, CopyBack = CopyBack, CopyFormulas = CopyFormulas, CopyStyles = CopyStyles, IsActive = IsActive, IsScenario = IsScenario, Name = Name, PrintBorder = PrintBorder, PropertySetInfo = PropertySetInfo, Protected = Protected, Ranges = Ranges, ScenarioComment = ScenarioComment, ShowBorder = ShowBorder, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRanges = js.Any.fromFunction1(addRanges), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRanges = js.Any.fromFunction0(getRanges), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
  
    __obj.asInstanceOf[Scenario]
  }
}

