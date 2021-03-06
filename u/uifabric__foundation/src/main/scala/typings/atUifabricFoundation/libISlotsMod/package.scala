package typings.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libISlotsMod {
  import typings.atUifabricFoundation.Anon_Slots
  import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ElementType
  import typings.react.reactMod.FunctionComponent
  import typings.react.reactMod.PropsWithChildren
  import typings.std.ReturnType

  type ExtractProps[TUnion] = js.Any
  type ExtractShorthand[TUnion] = String | Double | Boolean
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.atUifabricFoundation.atUifabricFoundationStrings.ISlotDefinition with TSlots
  type ISlotFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = js.Function4[
    /* componentProps */ TProps with IProcessedSlotProps, 
    /* userProps */ ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], 
    /* defaultStyles */ IStyle, 
    ReturnType[FunctionComponent[TProps]]
  ]
  type ISlotProp[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = TShorthandProp | TProps
  type ISlotRender[TProps] = js.Function2[
    /* props */ PropsWithChildren[TProps], 
    /* defaultComponent */ ComponentType[TProps], 
    ReturnType[FunctionComponent[TProps]]
  ]
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.atUifabricFoundation.atUifabricFoundationStrings.ISlots with TSlots
  type ISlottableComponentType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ComponentType[TProps] with (ISlotCreator[TProps, TShorthandProp])
  type ISlottableProps[TSlots] = TSlots with Anon_Slots[TSlots]
  type ISlottableReactType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ElementType[TProps] with (ISlotCreator[TProps, TShorthandProp])
  type ValidProps = js.Object
  type ValidShorthand = String | Double | Boolean
}
