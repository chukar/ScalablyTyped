package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/local", JSImport.Namespace)
@js.native
object builtDriverProvidersLocalMod extends js.Object {
  @js.native
  class Local protected () extends DriverProvider {
    def this(config: Config) = this()
    var server_ : js.Any = js.native
    /**
      * Helper to locate the default jar path if none is provided by the user.
      * @private
      */
    def addDefaultBinaryLocs_(): Unit = js.native
  }
  
}

