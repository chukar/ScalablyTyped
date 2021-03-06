package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layer is an entity inside a document which contains shapes.
  *
  * There could be zero or more {@link Shapes} attached to such a layer.
  *
  * The properties of a {@link Layer} instance affect all {@link Shapes} attached to the {@link Layer} .
  * @see DrawingDocument
  * @see LayerManager
  */
trait Layer extends XPropertySet {
  /** If a {@link Layer} is locked, the objects in this {@link Layer} cannot be edited in the user interface. */
  var IsLocked: Boolean
  /** If a {@link Layer} is not printable, the objects in this {@link Layer} are not printed. */
  var IsPrintable: Boolean
  /** If a {@link Layer} is not visible, the objects in this {@link Layer} are not shown in the user interface. */
  var IsVisible: Boolean
  /** The name of a {@link Layer} is used to identify the {@link Layer} in the user interface. */
  var Name: String
}

object Layer {
  @scala.inline
  def apply(
    IsLocked: Boolean,
    IsPrintable: Boolean,
    IsVisible: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
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
  ): Layer = {
    val __obj = js.Dynamic.literal(IsLocked = IsLocked, IsPrintable = IsPrintable, IsVisible = IsVisible, Name = Name, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Layer]
  }
}

