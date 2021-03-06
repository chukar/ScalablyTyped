package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is a presentation that is available from a {@link PresentationDocument} via the {@link XPresentationSupplier} interface. */
trait Presentation
  extends XPresentation
     with XPropertySet {
  /** enables/disables the shape animations. */
  var AllowAnimations: Boolean
  /** If this string is not empty, it contains the name of a customized show that is used for the presentation. */
  var CustomShow: String
  /** If this string is not empty, it contains the name of the page where the presentation is started. */
  var FirstPage: String
  /** If this property is set to `TRUE` , the window of the presentation is always on top of all other windows. */
  var IsAlwaysOnTop: Boolean
  /**
    * If this property is `TRUE` , all pages are changed automatically.
    *
    * This overrides the properties of the pages.
    */
  var IsAutomatic: Boolean
  /** If this property is set to `TRUE` , the presentation is repeated endlessly. */
  var IsEndless: Boolean
  /** If this property is set to `TRUE` , the presentation runs in full-screen mode. */
  var IsFullScreen: Boolean
  /**
    * With this property, you can set the presentation to live mode.
    *
    * Implementations that have no live mode capability may ignore this property and always return false.
    */
  var IsLivePresentation: Boolean
  /** If this property is `TRUE` , the mouse is visible during the presentation. */
  var IsMouseVisible: Boolean
  /**
    * is the duration of the black screen after the presentation has finished.
    *
    * If this is set to `0` , no black screen is shown.
    */
  var Pause: Double
  /** If this is set to `TRUE` , the Navigator is opened at the start of the presentation. */
  var StartWithNavigator: Boolean
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: Boolean
}

object Presentation {
  @scala.inline
  def apply(
    AllowAnimations: Boolean,
    CustomShow: String,
    FirstPage: String,
    IsAlwaysOnTop: Boolean,
    IsAutomatic: Boolean,
    IsEndless: Boolean,
    IsFullScreen: Boolean,
    IsLivePresentation: Boolean,
    IsMouseVisible: Boolean,
    Pause: Double,
    PropertySetInfo: XPropertySetInfo,
    StartWithNavigator: Boolean,
    UsePen: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    end: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    rehearseTimings: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    start: () => Unit
  ): Presentation = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations, CustomShow = CustomShow, FirstPage = FirstPage, IsAlwaysOnTop = IsAlwaysOnTop, IsAutomatic = IsAutomatic, IsEndless = IsEndless, IsFullScreen = IsFullScreen, IsLivePresentation = IsLivePresentation, IsMouseVisible = IsMouseVisible, Pause = Pause, PropertySetInfo = PropertySetInfo, StartWithNavigator = StartWithNavigator, UsePen = UsePen, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), rehearseTimings = js.Any.fromFunction0(rehearseTimings), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Presentation]
  }
}

