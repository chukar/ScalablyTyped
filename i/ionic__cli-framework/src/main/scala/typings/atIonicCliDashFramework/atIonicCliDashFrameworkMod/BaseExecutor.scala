package typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.libExecutorMod.BaseExecutorDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "BaseExecutor")
@js.native
class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
  extends typings.atIonicCliDashFramework.libMod.BaseExecutor[C, N, M, I, O] {
  def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
}

