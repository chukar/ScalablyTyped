package typings.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libExecutorMod {
  import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.help
  import typings.atIonicCliDashFramework.libHelpMod.CommandHelpSchema
  import typings.atIonicCliDashFramework.libHelpMod.NamespaceHelpSchema
  import typings.atIonicCliDashFramework.utilsIpcMod.RPC

  type HelpRPC[S /* <: CommandHelpSchema | NamespaceHelpSchema */] = RPC[help, js.Array[js.Array[String]], S]
}
