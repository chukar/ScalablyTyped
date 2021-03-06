package typings.bugsnagDashJs

import typings.bugsnagDashJs.typesClientMod.Client
import typings.bugsnagDashJs.typesClientMod.IPlugin
import typings.bugsnagDashJs.typesCommonMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js", JSImport.Namespace)
@js.native
object bugsnagDashJsMod extends js.Object {
  // two ways to call the exported function: apiKey or config object
  def default(apiKeyOrOpts: String): Client = js.native
  def default(apiKeyOrOpts: String, plugins: js.Array[IPlugin]): Client = js.native
  def default(apiKeyOrOpts: IConfig): Client = js.native
  def default(apiKeyOrOpts: IConfig, plugins: js.Array[IPlugin]): Client = js.native
  @js.native
  object Bugsnag extends js.Object {
    @js.native
    class Client ()
      extends typings.bugsnagDashJs.typesClientMod.Client
    
    @js.native
    class default ()
      extends typings.bugsnagDashJs.typesClientMod.Client
    
  }
  
}

