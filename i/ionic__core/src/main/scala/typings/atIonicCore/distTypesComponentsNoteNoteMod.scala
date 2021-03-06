package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/note/note", JSImport.Namespace)
@js.native
object distTypesComponentsNoteNoteMod extends js.Object {
  @js.native
  class Note () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    @JSName("render")
    def render_MNote(): js.Any = js.native
  }
  
}

