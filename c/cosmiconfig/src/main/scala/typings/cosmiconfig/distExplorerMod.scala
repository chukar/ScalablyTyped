package typings.cosmiconfig

import typings.cosmiconfig.distExplorerBaseMod.ExplorerBase
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.ExplorerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/Explorer", JSImport.Namespace)
@js.native
object distExplorerMod extends js.Object {
  @js.native
  class Explorer protected () extends ExplorerBase[ExplorerOptions] {
    def this(options: ExplorerOptions) = this()
    var createCosmiconfigResult: js.Any = js.native
    var loadFileContent: js.Any = js.native
    var loadSearchPlace: js.Any = js.native
    var searchDirectory: js.Any = js.native
    var searchFromDirectory: js.Any = js.native
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
  }
  
}

