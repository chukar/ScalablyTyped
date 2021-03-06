package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandHelpFormatter")
@js.native
abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
  def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  var _fullName: js.UndefOr[String] = js.native
  var _metadata: js.UndefOr[M] = js.native
  val command: C = js.native
  val dotswidth: Double = js.native
  val location: NamespaceLocateResult[C, N, M, I, O] = js.native
  /**
    * Given an option definition from command metadata, decide whether to keep
    * or discard it.
    *
    * @return `true` to keep, `false` to discard
    */
  def filterOptionCallback(option: O): js.Promise[Boolean] = js.native
  def getCommandFullName(): js.Promise[String] = js.native
  def getCommandMetadata(): js.Promise[M | (HydratedCommandMetadata[C, N, M, I, O])] = js.native
  /* protected */ def normalizeMetadata(metadata: (HydratedCommandMetadata[C, N, M, I, O]) | M): M = js.native
}

