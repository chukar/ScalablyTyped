package typings.aureliaDashKnockout

import typings.aureliaDashLoader.aureliaDashLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-knockout/dist/commonjs/require-polyfill", JSImport.Namespace)
@js.native
object distCommonjsRequireDashPolyfillMod extends js.Object {
  @js.native
  class RequirePolyfill protected () extends js.Object {
    def this(loader: Loader) = this()
    var loader: Loader = js.native
    /**
      * Registers the `require` function if not set.
      */
    def register(): Unit = js.native
  }
  
}

