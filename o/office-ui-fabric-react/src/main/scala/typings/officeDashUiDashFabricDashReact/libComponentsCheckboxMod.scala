package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotBaseMod.ICheckboxState
import typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Checkbox", JSImport.Namespace)
@js.native
object libComponentsCheckboxMod extends js.Object {
  @js.native
  class CheckboxBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotBaseMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  
  val Checkbox: StatelessComponent[ICheckboxProps] = js.native
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    var defaultProps: ICheckboxProps = js.native
    def getDerivedStateFromProps(nextProps: ICheckboxProps, prevState: ICheckboxState): ICheckboxState | Null = js.native
  }
  
}

