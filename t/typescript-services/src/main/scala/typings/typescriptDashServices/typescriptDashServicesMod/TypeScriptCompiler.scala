package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
class TypeScriptCompiler ()
  extends typings.typescriptDashServices.TypeScript.TypeScriptCompiler {
  def this(logger: ILogger) = this()
  def this(logger: ILogger, _settings: typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings) = this()
}

/* static members */
@JSImport("typescript-services", "TypeScriptCompiler")
@js.native
object TypeScriptCompiler extends js.Object {
  def getFullDiagnosticText(
    diagnostic: typings.typescriptDashServices.TypeScript.Diagnostic,
    resolvePath: js.Function1[/* path */ String, String]
  ): String = js.native
  /* private */ def getLocationText(location: js.Any, resolvePath: js.Any): js.Any = js.native
  def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  def mapToFileNameExtension(extension: String, fileName: String, wholeFileNameReplaced: Boolean): String = js.native
  def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = js.native
}

