package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerDotTypesMod.IBaseExtendedPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", JSImport.Namespace)
@js.native
object libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class ExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}

