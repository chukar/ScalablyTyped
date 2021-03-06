package typings.atMaterialChips

import typings.atMaterialChips.chipAdapterMod.MDCChipAdapter
import typings.atMaterialChips.chipFoundationMod.default
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/chip", JSImport.Namespace)
@js.native
object chipMod extends js.Object {
  @js.native
  class MDCChip ()
    extends typings.atMaterialBase.componentMod.default[MDCChipAdapter, default] {
    val foundation: default = js.native
    val ripple: MDCRipple = js.native
    /**
      * Returns true if the chip is selected.
      */
    def isSelected(): Boolean = js.native
    /**
      * Destroys the chip and removes the root element from the DOM.
      */
    def remove(): Unit = js.native
  }
  
  @js.native
  class MDCChipFoundation () extends default
  
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    def attachTo(root: Element): MDCChip = js.native
  }
  
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    val cssClasses: typings.atMaterialChips.chipConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCChipAdapter = js.native
    val strings: typings.atMaterialChips.chipConstantsMod.strings = js.native
  }
  
}

