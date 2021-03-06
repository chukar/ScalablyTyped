package typings.atIonicCliDashFramework.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.Footnote
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandSchemaHelpFormatter")
@js.native
class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  def formatCommand(cmd: (HydratedCommandMetadata[C, N, M, I, O]) | M): js.Promise[CommandHelpSchema] = js.native
  def formatFootnote(footnote: Footnote): CommandHelpSchemaFootnote = js.native
  def formatInput(input: I): js.Promise[CommandHelpSchemaInput] = js.native
  def formatInputs(inputs: js.Array[I]): js.Promise[js.Array[CommandHelpSchemaInput]] = js.native
  def formatOption(option: O): js.Promise[CommandHelpSchemaOption] = js.native
  def formatOptions(options: js.Array[O]): js.Promise[js.Array[CommandHelpSchemaOption]] = js.native
  def serialize(): js.Promise[CommandHelpSchema] = js.native
}

